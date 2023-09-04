package com.solap.cmsbe.repo;

import com.solap.cmsbe.core.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<com.solap.cmsbe.core.domain.entity.Customer, Long> {

    Customer findCustomerByPhoneNumber(String phoneNumber);
}
