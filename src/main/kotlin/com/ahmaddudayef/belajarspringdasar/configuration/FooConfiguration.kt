package com.ahmaddudayef.belajarspringdasar.configuration

import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class FooConfiguration {

    @Bean
    @Primary
    fun foo1(): Foo = Foo()

    @Bean
    fun foo2(): Foo = Foo()

    @Bean
    fun foo3(): Foo = Foo()
}