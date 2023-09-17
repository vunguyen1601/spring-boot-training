package tech.outsource.training.pratice001.controller.api.products;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.exercise001.models.TestGetResponse;
import tech.outsource.training.pratice001.controller.api.exercise003.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;

import java.util.List;

@Tag(name = "Area", description = "the area API")
@RequestMapping("/v1/api/products")
public interface ProductsApi {

    @GetMapping
    List<ProductResponse> list();
@PostMapping
    void create(@RequestBody ProductRequest productRequest);


}


