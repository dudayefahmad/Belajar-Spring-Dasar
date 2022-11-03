package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import mu.KotlinLogging
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.context.annotation.Lazy


private val logger = KotlinLogging.logger {}

@Configuration
class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn("bar")
    fun foo(): Foo {
        logger.info("Create new foo")
        return Foo()
    }

    @Bean
    fun bar(): Bar {
        logger.info("Create new bar")
        return Bar()
    }
}