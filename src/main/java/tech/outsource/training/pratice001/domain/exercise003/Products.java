package tech.outsource.training.pratice001.domain.exercise003;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

public class Products {
    final List<Product> products;

    public Products(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
