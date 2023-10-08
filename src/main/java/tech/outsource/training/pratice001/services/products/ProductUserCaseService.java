package tech.outsource.training.pratice001.services.products;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;
import tech.outsource.training.pratice001.domain.common.PageImplResponse;
import tech.outsource.training.pratice001.domain.products.Product;
import tech.outsource.training.pratice001.repository.database.entities.ProductEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductUserCaseService {
    final ProductCommandService productCommandService;

    public void save (Product product){
        productCommandService.save(product);
    }


    public Optional<ProductEntity> findById(Integer id){
        return productCommandService.findById(id);
    }

    public void update (Integer id, Product product){
        productCommandService.update(id, product);
    }

}
/*    public PageImplResponse<ProductEntity> findAll(Integer currentPage, Integer pageSize){
        Pageable pageable = PageRequest.of(currentPage,pageSize);
        Page<ProductEntity> productEntityPage = productCommandService.findByAll(pageable);
        List<ProductEntity> productEntityList = productEntityPage.getContent();
        List<ProductResponse> productResponseList = new ArrayList<>();
        for (ProductEntity productEntity : productEntityList) {
            ProductResponse productResponse = new ProductResponse(
                    productEntity.getProductId(),
                    productEntity.getProductCode(),
                    productEntity.getName(),
                    productEntity.getCategory(),
                    productEntity.getCreatedAt(),
                    productEntity.getUpdatedAt()
            );
            productResponseList.add(productResponse);
        }
        PageImplResponse<ProductResponse> pageResponse = new PageImplResponse<>(
                productResponseList,
                true, // Hoặc bạn có thể kiểm tra kết quả tìm kiếm để xác định success
                productEntityPage.getTotalElements(), // Tổng số khách hàng
                pageSize, // Kích thước trang
                currentPage // Trang hiện tại
        );

        return pageResponse;
    }*/