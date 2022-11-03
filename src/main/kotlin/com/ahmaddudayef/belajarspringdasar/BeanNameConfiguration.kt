package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class BeanNameConfiguration {

    @Primary
    @Bean(name = ["fooFirst"])
    fun foo1(): Foo {
        return Foo()
    }

    @Bean(name = ["fooSecond"])
    fun foo2(): Foo {
        return Foo()
    }
}