package com.solap.cmsbe.core.service;

import com.solap.cmsbe.core.domain.dto.request.CustomerRequestDTO;
import com.solap.cmsbe.core.domain.dto.response.GeneralResponse;
import com.solap.cmsbe.core.domain.entity.Customer;

public interface CustomerService {
    GeneralResponse<Customer> createCustomer(CustomerRequestDTO requestDTO);
}
