package com.ahmaddudayef.belajarspringdasar.application

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import com.ahmaddudayef.belajarspringdasar.listener.AppStartingListener
import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean


@SpringBootApplication
class FooApplication {

//    test error
//    @Bean
//    fun foo(bar: Bar): Foo {
//        return Foo()
//    }

    @Bean
    fun foo(): Foo {
        return Foo()
    }
}

//fun main(args: Array<String>) {
//    val applicationContext = SpringApplication.run(FooApplication::class.java, *args)
//    val foo = applicationContext.getBean(Foo::class.java)
//    println(foo)
//}

//fun main(args: Array<String>) {
//    val application = SpringApplication(FooApplication::class.java)
//    application.setBannerMode(Banner.Mode.OFF)
//    application.setListeners(listOf(AppStartingListener()))
//
//    val applicationContext = application.run(*args)
//
//    val foo = applicationContext.getBean(Foo::class.java)
//    println(foo)
//}
