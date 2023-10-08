package tech.outsource.training.pratice001.controller.api.products;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.products.models.ProductRequest;
import tech.outsource.training.pratice001.domain.common.PageImplResponse;
import tech.outsource.training.pratice001.domain.products.Product;
import tech.outsource.training.pratice001.repository.database.entities.ProductEntity;
import tech.outsource.training.pratice001.services.products.ProductUserCaseService;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProductsController implements ProductsApi {
    final ProductUserCaseService productUserCaseService;

    @Override
    public Optional<ProductEntity> findById(Integer id) {
        Optional<ProductEntity> foundProduct = productUserCaseService.findById(id);
        return  foundProduct;
    }

    @Override
    public void createProduct(ProductRequest productRequest) {
        productUserCaseService.save(new Product(
                productRequest.code(),
                productRequest.name(),
                productRequest.category(),
                LocalDateTime.now(),
                LocalDateTime.now()));
    }

    @Override
    public void updateProduct(Integer id,ProductRequest productRequest) {
        productUserCaseService.update(id, Product.of(productRequest));
    }

}












