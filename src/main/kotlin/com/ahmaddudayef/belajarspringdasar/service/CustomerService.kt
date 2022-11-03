package com.ahmaddudayef.belajarspringdasar.service

import com.ahmaddudayef.belajarspringdasar.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class CustomerService {

    @Autowired
    @Qualifier("premiumCustomerRepository")
    lateinit var premiumCustomerRepository: CustomerRepository

    @Autowired
    @Qualifier("normalCustomerRepository")
    lateinit var normalCustomerRepository: CustomerRepository

}