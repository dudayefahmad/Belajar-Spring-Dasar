package com.ahmaddudayef.belajarspringdasar.service

import com.ahmaddudayef.belajarspringdasar.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

//@Scope("prototype")
//@Lazy
@Component
class ProductService {

    lateinit var productRepository: ProductRepository

    @Autowired
    fun ProductService(productRepository: ProductRepository) {
        this.productRepository = productRepository
    }

    fun ProductService(productRepository: ProductRepository, name: String) {
        this.productRepository = productRepository
    }

}