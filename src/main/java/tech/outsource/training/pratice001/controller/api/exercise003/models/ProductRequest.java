package tech.outsource.training.pratice001.controller.api.exercise003.models;


public record ProductRequest (
    Integer id,
    String code,
    String name,
    String category){
    public static ProductRequest ofEmpty(){
        return new ProductRequest (0,"", "", "");
    }
}
