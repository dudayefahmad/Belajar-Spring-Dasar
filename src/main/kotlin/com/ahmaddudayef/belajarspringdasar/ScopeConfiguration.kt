package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import com.ahmaddudayef.belajarspringdasar.scope.DoubletonScop
import mu.KotlinLogging
import org.springframework.beans.factory.config.CustomScopeConfigurer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope


private val logger = KotlinLogging.logger {}

@Configuration
class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    fun foo(): Foo {
        logger.info("Create new foo")
        return Foo()
    }

    @Bean
    fun customScopeConfigurer(): CustomScopeConfigurer {
        val configurer = CustomScopeConfigurer()
        configurer.addScope("doubleton", DoubletonScop())
        return configurer
    }

    @Bean
    @Scope("doubleton")
    fun bar(): Bar {
        logger.info("Create new bar")
        return Bar()
    }
}