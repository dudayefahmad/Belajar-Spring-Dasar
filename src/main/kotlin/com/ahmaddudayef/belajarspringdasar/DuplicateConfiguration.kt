package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DuplicateConfiguration {

    @Bean
    fun foo1(): Foo {
        return Foo()
    }

    @Bean
    fun foo2(): Foo {
        return Foo()
    }
}