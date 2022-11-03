package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import com.ahmaddudayef.belajarspringdasar.data.FooBar
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class DependencyInjectionConfiguration {

    @Primary
    @Bean
    fun fooFirst(): Foo = Foo()

    @Bean
    fun fooSecond(): Foo = Foo()

    @Bean
    fun bar(): Bar = Bar()

    @Bean
    fun fooBar(@Qualifier("fooSecond")foo: Foo, bar: Bar) = FooBar(foo, bar)
}