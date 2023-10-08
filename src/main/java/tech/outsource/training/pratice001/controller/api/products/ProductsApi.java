package tech.outsource.training.pratice001.controller.api.products;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.products.models.ProductRequest;
import tech.outsource.training.pratice001.domain.common.PageImplResponse;
import tech.outsource.training.pratice001.repository.database.entities.ProductEntity;

import java.util.Optional;

@Tag(name = "Area", description = "the area API")
@RequestMapping("/v1/api/products")
public interface ProductsApi {
    @GetMapping("{id}")
    Optional<ProductEntity> findById(@PathVariable("id") Integer id);

    @PostMapping
    void createProduct (@RequestBody ProductRequest productRequest);

    @PutMapping("{id}")
    void updateProduct (@PathVariable("id") Integer id, @RequestBody ProductRequest productRequest);

}


