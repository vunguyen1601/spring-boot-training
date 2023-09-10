package tech.outsource.training.pratice001.controller.api.exercise002;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.exercise002.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.exercise002.models.TestGetResponse;
import tech.outsource.training.pratice001.dto.Vehicle;
import tech.outsource.training.pratice001.dto.Vehicles;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Exercise002 implements Exercise002Api {



    @Override
    public TestGetResponse testGet(Integer id) {
        return new TestGetResponse(id, "ok");
    }

    @Override
    public Vehicles long001(Integer id) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1, "001", "Honda","Lead"));
        list.add(new Vehicle(2, "002", "Yamaha","Novo"));

        Vehicles vehicles = new Vehicles(list);
        return vehicles;
    }

    @Override
    public ProductRequest testPost(ProductRequest productRequest) {
        return productRequest;
    }


}
