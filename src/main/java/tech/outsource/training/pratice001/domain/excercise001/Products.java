package tech.outsource.training.pratice001.domain.excercise001;

import java.util.List;

public class Products {
    List< Product> list;

    public Products(List<Product> list) {
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}
