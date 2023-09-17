package tech.outsource.training.pratice001.controller.api.exercise002;

import tech.outsource.training.pratice001.controller.api.exercise002.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.exercise002.models.Vehicles;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.exercise001.models.TestGetResponse;
import tech.outsource.training.pratice001.controller.api.exercise001.models.Vehicle;

@Tag(name = "exercise", description = "the area API")
@RequestMapping("/v1/api/exercise002")
public interface Exercise002Api {

    @PostMapping("/save")
    void save(@RequestBody ProductRequest productRequest);
    @GetMapping("{id}")
    TestGetResponse testGet(@PathVariable("id") Integer id);
    @GetMapping("/product/{code}")
    Vehicle getProduct(@PathVariable("code") String code);
    @GetMapping("/product/all")
    Vehicles getProducts();
    @PutMapping("/product/update")
    void update(@RequestBody ProductRequest productRequest);
    @DeleteMapping ("/product/{code}")
    void delete (@PathVariable("code") String code);

}
