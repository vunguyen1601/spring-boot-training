package tech.outsource.training.pratice001.controller.api.exercise003;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.domain.excercise001.Product;
import tech.outsource.training.pratice001.domain.excercise001.Products;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Exercise003 implements Exercise003Api {
    public static List<Product> list = new ArrayList<>();

    @Override
    public Products getProduct() {
        return new Products(list);
    }

    @Override
    public void createProducts(ProductRequest productRequest) {
       list.add(new Product(productRequest.id(),productRequest.code(),productRequest.name(), productRequest.category(), LocalDateTime.now(),LocalDateTime.now()));
    }

    @Override
    public void deleteProduct(Integer id) {
        int index= -1;
        for( int i=0;i<list.size();i++){
            Product product = list.get(i);
            if( product.id()==id){
                index =i;
                break;
            }
        }
        list.remove(index);
    }

    @Override
    public void updateProduct(ProductRequest productRequest) {
        int id = productRequest.id();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            if (id == product.id()) {
                index = i;
            }
        }

        list.set(index, new Product(productRequest.id(),
                productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now()));

    }

    @Override
    public Product getProduct(Integer id) {
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            if (product.id() == id) {
                return product;
            }
        }
        return new Product(0, "", "", "", LocalDateTime.now(), LocalDateTime.now());
    }
}