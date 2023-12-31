package tech.outsource.training.pratice001.controller.api.products;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;
import tech.outsource.training.pratice001.domain.excercise001.Product;
import tech.outsource.training.pratice001.service.excercise001.ProductUseCaseService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static tech.outsource.training.pratice001.controller.api.exercise003.Exercise003.list;

@RestController
@RequiredArgsConstructor
public class ProductsController implements ProductsApi {

final ProductUseCaseService productUseCaseService;


    @Override
    public List<ProductResponse> list() {
        return productUseCaseService
                .list().stream()
                .map(product -> new ProductResponse(product.id(),
                        product.code(),
                        product.name(),
                        product.category(),
                        product.createAt(),
                        product.updateAt()))
                .collect(Collectors.toList());
    }

    @Override
    public void create(ProductRequest productRequest) {
Product product= new Product(
  productRequest.id(),
        productRequest.code(),
        productRequest.name(),
        productRequest.category(),
        LocalDateTime.now(),
        LocalDateTime.now()
);
        productUseCaseService.create(product);
    }

    @Override
    public void updateProduct(ProductRequest productRequest) {
        Product product=new Product(
                productRequest.id(),
                productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now());
        productUseCaseService.update(product);
    }

    @Override
    public void deleteProduct(Integer id) {

//       productUseCaseService.delete();
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
