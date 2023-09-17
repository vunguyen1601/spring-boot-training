package tech.outsource.training.pratice001.controller.api.exercise003;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.domain.excercise001.Product;
import tech.outsource.training.pratice001.domain.excercise001.Products;

@Tag(name = "Area", description = "the area API")
@RequestMapping("/v1/api/exercise003")
public interface Exercise003Api {
    @GetMapping("/product")
    Products getProduct();

    @PostMapping("/create")
    void createProducts(@RequestBody ProductRequest productRequest);

    @PutMapping("/update")
    void updateProduct(@RequestBody ProductRequest productRequest);

    @DeleteMapping("/delete")
    void deleteProduct(@RequestParam("id") Integer id);
    @GetMapping("/getProduct/{id}")
    Product getProduct(@RequestParam("id") Integer id);
}
