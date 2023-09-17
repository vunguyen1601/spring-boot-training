package tech.outsource.training.pratice001.controller.api.exercise003;

import ch.qos.logback.core.util.Loader;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductResponse;
import tech.outsource.training.pratice001.domain.exercise003.Product;
import tech.outsource.training.pratice001.domain.exercise003.Products;
import tech.outsource.training.pratice001.services.exercise003.Exercise003Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequiredArgsConstructor
public class Exercise003 implements Exercise003Api {
    @NonNull Exercise003Service exercise003Service;

    static List<Product> list = new ArrayList<>();
    @Override
    public List<ProductResponse> list() {
        return ProductResponse.of(exercise003Service
                .list());
    }

    @Override
    public ProductResponse getProduct() {
        return null;
    }

    @Override
    public void createProducts(ProductRequest productRequest) {
        Product product = new Product(
                ThreadLocalRandom.current().nextInt(1,1000),  //Hàm Random 1-1000 cho id
                //productRequest.id(), //Nêu không sử dụng Random thì thêm id dô ProductRequest
                productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now());
        exercise003Service.create(product);
    }

    @Override
    public void updateProducts(ProductRequest productRequest) {
        int id = productRequest.id();
        int index = -1;
        for(int i = 0;i < list().size();i++ ){
            Product product = list.get(i);
            if (id == product.id()){
                index = 1;
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
    public void deleteProduct(Integer id) {
        int index = -1;
        for (int i =0; i < list().size(); i++) {
            Product product = list.get(i);
            if (product.id() == id ) {
                index = -1;
                break;
            }
        }
        list.remove(index);
    }


}
