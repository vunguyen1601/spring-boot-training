package tech.outsource.training.pratice001.services.customers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.customers.Customer;
import tech.outsource.training.pratice001.repository.database.entities.CustomerEntity;
import tech.outsource.training.pratice001.repository.database.customers.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerCommandService {
    @NonNull
    final CustomerRepository repository;

    void save(Customer customer){
        CustomerEntity customerEntity = CustomerEntity.of(customer);
        repository.save(customerEntity);
    }

    void delete(Customer customer){
        repository.deleteById(customer.id());
    }
}
