package tech.outsource.training.pratice001.services.customers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.customers.Customer;

@Service
@RequiredArgsConstructor
public class CustomerUseCaseService {
    final CustomerCommandService commandService;

    public void save(Customer customer){
        commandService.save(customer);
    }
}
