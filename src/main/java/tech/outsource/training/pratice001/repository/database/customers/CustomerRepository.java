package tech.outsource.training.pratice001.repository.database.customers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.outsource.training.pratice001.repository.database.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    Page<CustomerEntity> findAll(Pageable pageable);

}
