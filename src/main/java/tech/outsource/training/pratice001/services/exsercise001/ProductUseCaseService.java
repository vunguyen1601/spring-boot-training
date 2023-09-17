package tech.outsource.training.pratice001.services.exsercise001;


import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.exercise001.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductUseCaseService {
    List<Product> products = new ArrayList<>();

    public List<Product> list() {
        return products;
    }

    public Product get(String code) {
        Optional<Product> productOpt = products.stream()
                .filter(product -> product.code().equals(code))
                .findFirst();
        return productOpt.orElse(Product.ofEmpty());
    }

    public void create(Product product) {
        products.add(product);
    }

    public void update(Product product) {
        String code = product.code();
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.code().equals(code)) {
                index = i;

            }
        }
        products.set(index, new Product(product.id(),
                product.code(),
                product.name(),
                product.category(),
                LocalDateTime.now(),
                LocalDateTime.now()));
    }
    public void delete (String code){
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.code().equals(code)) {
                index = i;

            }
        }
        products.remove(index);
    }


}
