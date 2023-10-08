package tech.outsource.training.pratice001.repository.database.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import tech.outsource.training.pratice001.domain.products.Product;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products_lanh")
@Builder
public class ProductEntity implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "product_id")
        Integer productId;
        @Column(name = "product_code")
        String productCode;
        @Column(name = "product_category")
        String category;
        @Column(name = "product_name")
        String name;
        @Column(name = "createdAt")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime createdAt;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @Column(name = "updatedAt")
        LocalDateTime updatedAt;

        public static ProductEntity of(Product product) {
            return ProductEntity.builder()
                    .productCode(product.code())
                    .name(product.name())
                    .category(product.category())
                    .createdAt(product.createdAt())
                    .updatedAt(product.updatedAt())
                    .build();
        }
}
