package tech.outsource.training.pratice001.controller.api.customers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.outsource.training.pratice001.controller.api.customers.models.CustomerRequest;
import tech.outsource.training.pratice001.controller.api.customers.models.CustomerResponse;
import tech.outsource.training.pratice001.domain.common.PageImplResponse;
import tech.outsource.training.pratice001.domain.customers.Customer;
import tech.outsource.training.pratice001.services.customers.CustomerUseCaseService;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomersApi{
    final CustomerUseCaseService customerUseCaseService;
    @Override
    public CustomerResponse findBy(Integer id) {
        return null;
    }

    @Override
    public PageImplResponse<CustomerResponse> search(Integer currentPage, Integer pageSize) {
        return null;
    }

    @Override
    public void save(CustomerRequest userRequest) {
        customerUseCaseService.save(Customer.of(userRequest));
    }

    @Override
    public void deleteById(Integer id) {

    }
}
