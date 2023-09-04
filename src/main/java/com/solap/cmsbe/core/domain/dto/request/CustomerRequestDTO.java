package com.solap.cmsbe.core.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerRequestDTO {
    private String customerName;
    private String phoneNumber;
    private String address;
    private String yearOfBirth;
}
