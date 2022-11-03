package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Bar
import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ScopeTest {

    private lateinit var applicationContext: ApplicationContext

    @BeforeEach
    fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(ScopeConfiguration::class.java)
    }

    @Test
    fun testPrototypeScope() {
        var foo1 = applicationContext.getBean(Foo::class.java)
        var foo2 = applicationContext.getBean(Foo::class.java)
        var foo3 = applicationContext.getBean(Foo::class.java)

        Assertions.assertNotSame(foo1, foo2)
        Assertions.assertNotSame(foo1, foo3)
        Assertions.assertNotSame(foo2, foo3)
    }

    @Test
    fun testDoubletonScope() {
        val bar1 = applicationContext.getBean(Bar::class.java)
        val bar2 = applicationContext.getBean(Bar::class.java)
        val bar3 = applicationContext.getBean(Bar::class.java)
        val bar4 = applicationContext.getBean(Bar::class.java)

        Assertions.assertSame(bar1, bar3)
        Assertions.assertSame(bar2, bar4)

        Assertions.assertNotSame(bar1, bar2)
        Assertions.assertNotSame(bar3, bar4)
    }
}