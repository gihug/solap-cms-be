package com.solap.cmsbe.controller;

import com.solap.cmsbe.core.domain.dto.request.CustomerRequestDTO;
import com.solap.cmsbe.core.domain.dto.response.GeneralResponse;
import com.solap.cmsbe.core.domain.entity.Customer;
import com.solap.cmsbe.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public GeneralResponse<Customer> createCustomer(@RequestBody CustomerRequestDTO requestDTO){
        return customerService.createCustomer(requestDTO);
    }
}
