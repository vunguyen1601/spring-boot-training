package tech.outsource.training.pratice001.controller.api.exercise003;

import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.domain.exercise003.Product;
import tech.outsource.training.pratice001.domain.exercise003.Products;

import java.util.List;

@Tag(name = "exercise", description = "the area API")
@RequestMapping("/v1/api/exercise003")
public interface Exercise003Api {

    @GetMapping
    List<ProductResponse> list();
    @GetMapping("/get")
    ProductResponse getProduct();
    @PostMapping("/create")
    void createProducts(@RequestBody ProductRequest productRequest);

    @PutMapping("/update")
    void updateProducts(@RequestBody ProductRequest productRequest);

    @DeleteMapping("delete{id}")
    void deleteProduct(@RequestParam("id") Integer id);


}
