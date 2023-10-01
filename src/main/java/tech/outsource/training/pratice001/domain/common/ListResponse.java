package tech.outsource.training.pratice001.domain.common;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public record ListResponse<T> (@NonNull List<T> data) {
    public static <C> ListResponse<C> ofEmpty() {
        return new ListResponse<>(new ArrayList<>(0));
    }
}
