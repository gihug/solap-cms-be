package com.solap.cmsbe.core.service.impl;

import com.solap.cmsbe.core.domain.dto.request.CustomerRequestDTO;
import com.solap.cmsbe.core.domain.dto.response.GeneralResponse;
import com.solap.cmsbe.core.domain.entity.Customer;
import com.solap.cmsbe.core.service.CustomerService;
import com.solap.cmsbe.repo.CustomerRepository;
import com.solap.cmsbe.ultis.enums.StatusCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public GeneralResponse<Customer> createCustomer(CustomerRequestDTO requestDTO) {
        Customer customerResponseDTO = this.customerRepository.findCustomerByPhoneNumber(requestDTO.getPhoneNumber());
        if (!requestDTO.getPhoneNumber().isEmpty()
                && requestDTO.getPhoneNumber().equals(customerResponseDTO.getPhoneNumber())) {
            throw new IllegalArgumentException("Đã tồn tại sdt này trên hệ thống.");
        }
        Customer customer = Customer.builder()
                .customerName(requestDTO.getCustomerName())
                .address(requestDTO.getAddress())
                .phoneNumber(requestDTO.getPhoneNumber())
                .yearOfBirth(requestDTO.getYearOfBirth())
                .build();
        Customer customerSave = this.customerRepository.save(customer);
        GeneralResponse<Customer> generalResponse = new GeneralResponse<>() ;
        generalResponse.setCode(StatusCode.SUCCESS.getValue());
        generalResponse.setData(customerSave);
        return generalResponse;
    }
}
