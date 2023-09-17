package tech.outsource.training.pratice001.services.exercise003;

import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.exercise003.Product;
import tech.outsource.training.pratice001.domain.exercise003.Products;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class Exercise003Service {
    Products products = new Products(new ArrayList<>());

    public Products list() {
        return products;
    }
    public Product get(String code){
///Optional: chống Null, stream: xử lý luồng dữ lệu
        Optional<Product> productOpt =  products.getProducts().stream()
                .filter(product -> product.code().equals(code))
                .findFirst();
        return productOpt.orElse(Product.ofEmpty());
    }
    public void create(Product product) {
        products.getProducts().add(product);
    }

}
