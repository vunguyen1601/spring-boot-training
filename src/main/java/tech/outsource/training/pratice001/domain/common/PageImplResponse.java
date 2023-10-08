package tech.outsource.training.pratice001.domain.common;

import lombok.NonNull;
import tech.outsource.training.pratice001.controller.api.products.models.ProductResponse;
import tech.outsource.training.pratice001.repository.database.entities.ProductEntity;

import java.util.List;

public record PageImplResponse<ProductResponse>(@NonNull List<ProductResponse> data,
                                  boolean success,
                                  @NonNull Long total,
                                  @NonNull Integer pageSize,
                                  @NonNull Integer current) {}
