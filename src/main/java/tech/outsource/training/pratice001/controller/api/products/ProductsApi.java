package tech.outsource.training.pratice001.controller.api.products;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.exercise001.models.TestGetResponse;
import tech.outsource.training.pratice001.controller.api.products.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;

import java.util.List;

@Tag(name = "exercise", description = "the area API")
@RequestMapping("/v1/api/products")
public interface ProductsApi {

    @GetMapping
    List<ProductResponse> list();

    @GetMapping("{code}")
    ProductResponse get(@PathVariable("code") String code);

    @PostMapping
    void create(@RequestBody ProductRequest productRequest);
    @PutMapping("product")
    void update(@RequestBody ProductRequest productRequest);
    @DeleteMapping("{code}")
    void delete(@PathVariable ("code")String code);

}
