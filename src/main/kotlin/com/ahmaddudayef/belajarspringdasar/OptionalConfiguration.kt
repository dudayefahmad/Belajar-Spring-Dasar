package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import com.ahmaddudayef.belajarspringdasar.data.FooBar
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class OptionalConfiguration {

    @Bean
    fun foo(): Foo {
        return Foo()
    }

    @Bean
    fun fooBar(foo: Foo?, bar: Bar?): FooBar? {
        return FooBar(foo, bar)
    }
}