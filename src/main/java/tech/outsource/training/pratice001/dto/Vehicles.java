package tech.outsource.training.pratice001.dto;

import java.util.List;


public class Vehicles {
    List<Vehicle> list;

    public Vehicles(List<Vehicle> list) {
        this.list = list;
    }

    public List<Vehicle> getList() {
        return list;
    }

    public void setList(List<Vehicle> list) {
        this.list = list;
    }
}
