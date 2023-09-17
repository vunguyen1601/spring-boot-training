package tech.outsource.training.pratice001.controller.api.products;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.products.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;
import tech.outsource.training.pratice001.domain.exercise001.Product;
import tech.outsource.training.pratice001.services.exsercise001.ProductUseCaseService;

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
                .map(product -> new ProductResponse(
                        product.id(),
                        product.code(),
                        product.name(),
                        product.category(),
                        product.createdAt(),
                        product.updatedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponse get(String code) {
        return ProductResponse.of(productUseCaseService
                .get(code));
    }

    @Override
    public void create(ProductRequest productRequest) {
        Product product = new Product(
                1,
                productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        productUseCaseService.create(product);
    }

    @Override
    public void update(ProductRequest productRequest) {
        Product product = new Product(
                1,
                productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
        productUseCaseService.update(product);
    }

    @Override
    public void delete(String code) {
        productUseCaseService.delete(code);
    }


}
