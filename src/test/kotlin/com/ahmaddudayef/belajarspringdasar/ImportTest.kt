package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ImportTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(MainConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testImport() {
        var foo = applicationContext.getBean(Foo::class.java)
        var bar = applicationContext.getBean(Bar::class.java)
    }
}