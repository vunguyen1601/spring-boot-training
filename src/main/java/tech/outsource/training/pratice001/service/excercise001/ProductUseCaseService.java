package tech.outsource.training.pratice001.service.excercise001;

import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.excercise001.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static tech.outsource.training.pratice001.controller.api.exercise003.Exercise003.list;

@Service
public class ProductUseCaseService {
    List<Product> products = new ArrayList<>();

    public List<Product> list() {
        return products;
    }

    public Product getProduct(String code) {
        return null;
    }

    public void create(Product product) {
        products.add(product);
    }

    public void update(Product product) {
        int id = product.id();
        int index = -1;
        for (int i = 0; i < list().size(); i++) {
            Product products = list.get(i);
            if (id == products.id()) {
                index = i;
            }

            list.set(index, new Product(product.id(),
                    product.code(),
                    product.name(),
                    product.category(),
                    LocalDateTime.now(),
                    LocalDateTime.now()));
        }
    }
    public void delete(Product product ){
        int id = product.id();
        int index = -1;
        for (int i = 0; i < list().size(); i++) {
            Product products = list.get(i);
            if (id == products.id()) {
                index = i;
                break;
            }
        }
        list.remove(index);
    }
}
