package tech.outsource.training.pratice001.services.customers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.repository.database.customers.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerQueryService {
    @NonNull
    final CustomerRepository repository;

}
