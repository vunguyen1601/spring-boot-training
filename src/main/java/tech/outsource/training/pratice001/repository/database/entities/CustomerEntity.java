package tech.outsource.training.pratice001.repository.database.entities;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import tech.outsource.training.pratice001.domain.customers.Customer;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
@Builder
public class CustomerEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    Integer customerId;
    @Column(name = "customer_code")
    String customerCode;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "email")
    String email;

    public static CustomerEntity of(Customer customer) {
        return CustomerEntity.builder()
                .customerCode(customer.code())
                .firstName(customer.firstName())
                .lastName(customer.lastName())
                .email(customer.email())
                .build();
    }
}
