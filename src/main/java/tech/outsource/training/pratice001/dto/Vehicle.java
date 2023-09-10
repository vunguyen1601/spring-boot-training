package tech.outsource.training.pratice001.dto;

public class Vehicle {
    int id;
    String code;
    String producer ;
    String type;

    public Vehicle(int id, String code, String producer, String type) {
        this.id = id;
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

