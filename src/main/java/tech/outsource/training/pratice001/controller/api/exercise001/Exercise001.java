package tech.outsource.training.pratice001.controller.api.exercise001;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.exercise001.models.TestGetResponse;

@RestController
@RequiredArgsConstructor
public class Exercise001 implements Exercise001Api{
    @Override
    public TestGetResponse testGet(Integer id) {
        return new TestGetResponse(id, "ok");
    }

}
