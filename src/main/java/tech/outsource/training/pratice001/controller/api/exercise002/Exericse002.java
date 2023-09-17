package tech.outsource.training.pratice001.controller.api.exercise002;

import tech.outsource.training.pratice001.controller.api.exercise002.models.ProductRequest;
import tech.outsource.training.pratice001.controller.api.exercise002.models.Vehicles;
import tech.outsource.training.pratice001.controller.api.exercise001.models.TestGetResponse;
import tech.outsource.training.pratice001.controller.api.exercise001.models.Vehicle;

public class Exericse002 implements Exercise002Api
{

    @Override
    public void save(ProductRequest productRequest) {

    }

    @Override
    public TestGetResponse testGet(Integer id) {
        return null;
    }

    @Override
    public Vehicle getProduct(String code) {
        return null;
    }


    @Override
    public Vehicles getProducts() {
        return null;
    }

    @Override
    public void update(ProductRequest productRequest) {

    }

    @Override
    public void delete(String code) {

    }
}
