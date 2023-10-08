package tech.outsource.training.pratice001.services.products;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.domain.products.Product;
import tech.outsource.training.pratice001.repository.database.entities.ProductEntity;
import tech.outsource.training.pratice001.repository.database.products.ProductRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductCommandService {
    /*Được sử dụng để thực hiện các thao tác ghi (tạo mới và xóa) đối tượng Customer.
      Các phương thức trong  lớp này có trách nhiệm trực tiếp với cơ sở dữ liệu hoặc
      lưu trữ dữ liệu.*/
    @NonNull
    final ProductRepository repository;
    void save(Product product){
        ProductEntity productEntity = ProductEntity.of(product);
        repository.save(productEntity);
    }
    Optional<ProductEntity> findById(Integer id){
        return repository.findById(id);
    }

    void update (Integer id, Product product){
        Optional<ProductEntity> productEntity = findById(id);

        ProductEntity updateProduct = productEntity.get();
        updateProduct.setProductCode(product.code());
        updateProduct.setName(product.name());
        updateProduct.setCategory(product.category());
        updateProduct.setCreatedAt(LocalDateTime.now());
        updateProduct.setUpdatedAt(LocalDateTime.now());
        repository.save(updateProduct);
    }
    Page<ProductEntity> findByAll(Pageable pageable){

        return repository.findAll(pageable);
    }


}
