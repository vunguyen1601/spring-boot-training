package tech.outsource.training.pratice001.controller.api.exercise002;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.outsource.training.pratice001.controller.api.exercise002.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.exercise002.models.TestGetResponse;
import tech.outsource.training.pratice001.dto.Vehicles;

@Tag(name = "Area", description = "the area API")
@RequestMapping("/v1/api/exercise002")
public interface Exercise002Api {

    @GetMapping("{id}")
    TestGetResponse testGet(@PathVariable("id") Integer id);

    @GetMapping("/long001")
    Vehicles long001(@RequestParam("id") Integer id);

    @PostMapping
    ProductRequest testPost(@RequestBody ProductRequest productRequest);
}
