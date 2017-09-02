package com.yihecloud.service;

import com.yihecloud.entity.Customer;

import java.util.List;

/**
 * Created by jyb on 17-9-2.
 */
public interface ICustomerService {
    List<Customer> findByLastName(String lastName);
    Customer findById(Long id);
}
