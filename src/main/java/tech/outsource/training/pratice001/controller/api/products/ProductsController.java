package tech.outsource.training.pratice001.controller.api.products;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;
import tech.outsource.training.pratice001.domain.excercise001.Product;
import tech.outsource.training.pratice001.service.excercise001.ProductUseCaseService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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
}
