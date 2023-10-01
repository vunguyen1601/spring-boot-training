package tech.outsource.training.pratice001.domain.customers;

import tech.outsource.training.pratice001.controller.api.customers.models.CustomerRequest;

public record Customer(Integer id,
                       String code,
                       String firstName,
                       String lastName,
                       String email) {
    public static Customer of(CustomerRequest userRequest) {
        return new Customer(userRequest.id(),
                userRequest.customerCode(),
                userRequest.firstName(),
                userRequest.lastName(),
                userRequest.email());
    }
}
