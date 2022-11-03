package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ScanTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    internal fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(ScanConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testScan() {
        var foo = applicationContext.getBean(Foo::class.java)
        var bar = applicationContext.getBean(Bar::class.java)
    }
}