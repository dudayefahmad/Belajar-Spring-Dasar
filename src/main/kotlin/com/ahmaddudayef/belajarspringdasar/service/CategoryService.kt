package com.ahmaddudayef.belajarspringdasar.service

import com.ahmaddudayef.belajarspringdasar.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CategoryService {

    lateinit var categoryRepository: CategoryRepository

    @Autowired
    fun setCategoryRepository2(categoryRepository: CategoryRepository) {
        this.categoryRepository = categoryRepository
    }
}