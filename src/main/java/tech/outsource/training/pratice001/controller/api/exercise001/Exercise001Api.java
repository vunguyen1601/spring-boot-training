package tech.outsource.training.pratice001.controller.api.exercise001;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.outsource.training.pratice001.controller.api.exercise001.models.TestGetResponse;

@Tag(name = "exercise", description = "the area API")
@RequestMapping("/v1/api/exercise001")
public interface Exercise001Api {

    @GetMapping("{id}")
    TestGetResponse testGet(@PathVariable("id") Integer id);
}
