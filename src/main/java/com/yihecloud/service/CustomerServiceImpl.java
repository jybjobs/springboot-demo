package com.yihecloud.service;

import com.yihecloud.entity.Customer;
import com.yihecloud.entity.CustomerRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jyb on 17-9-2.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private CustomerRepository customerRepository ;

    @Override
    public List<Customer> findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }

    /**
     * 127.0.0.1:6379> get com.yihecloud.service.CustomerServiceImplfindById2
     "[\"com.yihecloud.entity.Customer\",{\"id\":2,\"firstName\":\"Chloe\",\"lastName\":\"O'Brian\"}]"
     * @param id
     * @return
     */
    @Cacheable(value = "customer") //添加到redis
    public Customer findById(Long id){
        return customerRepository.findOne(id);
    }

    /**
     * 删除缓存数据
     * @param id
     */
    @CacheEvict
    public void deleteById(Long id){
      //  customerRepository.delete(id);
        System.out.println("删除缓存......");
    }


}
