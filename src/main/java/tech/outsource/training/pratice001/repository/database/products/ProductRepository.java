package tech.outsource.training.pratice001.repository.database.products;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.outsource.training.pratice001.repository.database.entities.ProductEntity;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    Page<ProductEntity> findAll(Pageable pageable);
    Optional<ProductEntity> findById(Integer id);

}
