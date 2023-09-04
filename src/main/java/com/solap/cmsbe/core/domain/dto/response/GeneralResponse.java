package com.solap.cmsbe.core.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GeneralResponse<T> {
    private String code;
    private String message;
    private T data;
}
