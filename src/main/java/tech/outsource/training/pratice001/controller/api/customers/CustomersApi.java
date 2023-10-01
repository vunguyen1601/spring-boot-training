package tech.outsource.training.pratice001.controller.api.customers;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.outsource.training.pratice001.controller.api.customers.models.CustomerRequest;
import tech.outsource.training.pratice001.controller.api.customers.models.CustomerResponse;
import tech.outsource.training.pratice001.domain.common.PageImplResponse;

@Tag(name = "customers", description = "the customers API")
@RequestMapping("/v1/api/customers")
public interface CustomersApi {

    @GetMapping("{id}")
    CustomerResponse findBy(@PathVariable("id") Integer id);

    @GetMapping
    PageImplResponse<CustomerResponse> search(
            @RequestParam(required = false, value = "current", defaultValue = "1") @Min(1) Integer currentPage,
            @RequestParam(required = false, value = "pageSize", defaultValue = "20") Integer pageSize);

    @PostMapping
    void save(@Valid @RequestBody CustomerRequest userRequest);

    @DeleteMapping
    void deleteById(@RequestParam("id") Integer id);
}
