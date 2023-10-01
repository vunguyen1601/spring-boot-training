package tech.outsource.training.pratice001.controller.api.products;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;
import tech.outsource.training.pratice001.domain.excercise001.Product;

import java.util.List;

@Tag(name = "Area", description = "the area API")
@RequestMapping("/v1/api/products")
public interface ProductsApi {

    @GetMapping
    List<ProductResponse> list();
@PostMapping
    void create(@RequestBody ProductRequest productRequest);
    @PutMapping("/update")
    void updateProduct(@RequestBody ProductRequest productRequest);

    @DeleteMapping("/delete")
    void deleteProduct(@RequestParam("id") Integer id);
    @GetMapping("/getProduct/{id}")
    Product getProduct(@RequestParam("id") Integer id);
}


