package com.ahmaddudayef.belajarspringdasar.configuration

import com.ahmaddudayef.belajarspringdasar.repository.CustomerRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class CustomerConfiguration {

    @Bean
    @Primary
    fun normalCustomerRepository(): CustomerRepository = CustomerRepository()

    @Bean
    fun premiumCustomerRepository(): CustomerRepository = CustomerRepository()
}