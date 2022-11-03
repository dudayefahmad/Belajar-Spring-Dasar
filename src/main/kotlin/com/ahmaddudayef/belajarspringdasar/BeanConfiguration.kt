package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Foo
import mu.KotlinLogging
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

private val logger = KotlinLogging.logger {}

@Configuration
class BeanConfiguration {

    @Bean
    fun foo(): Foo {
        logger.info("Create new foo")
        return Foo()
    }
}