package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class BeanNameTest {

    private lateinit var applicationContext: ApplicationContext

    @BeforeEach
    fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(BeanNameConfiguration::class.java)
    }

    @Test
    fun testBeanName() {
        val foo = applicationContext.getBean(Foo::class.java)
        val foo1 = applicationContext.getBean("fooFirst", Foo::class.java)
        val foo2 = applicationContext.getBean("fooSecond", Foo::class.java)

        Assertions.assertSame(foo, foo1)
        Assertions.assertNotSame(foo, foo2)
        Assertions.assertNotSame(foo1, foo2)
    }
}