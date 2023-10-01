package tech.outsource.training.pratice001.domain.common;

import lombok.NonNull;

import java.util.List;

public record PageImplResponse<T>(@NonNull List<T> data,
                                  boolean success,
                                  @NonNull Long total,
                                  @NonNull Integer pageSize,
                                  @NonNull Integer current) {}
