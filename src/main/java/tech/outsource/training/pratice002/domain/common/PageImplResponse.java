package tech.outsource.training.pratice002.domain.common;

import lombok.NonNull;

import java.util.List;

public record PageImplResponse<ProductResponse>(@NonNull List<ProductResponse> data,
                                  boolean success,
                                  @NonNull Long total,
                                  @NonNull Integer pageSize,
                                  @NonNull Integer current) {}
