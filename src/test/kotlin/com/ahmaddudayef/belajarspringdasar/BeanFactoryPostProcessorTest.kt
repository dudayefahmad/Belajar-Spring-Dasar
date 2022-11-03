package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Foo
import com.ahmaddudayef.belajarspringdasar.processor.FooBeanFactoryPostProcessor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

class BeanFactoryPostProcessorTest {

    @Configuration
    @Import(
        FooBeanFactoryPostProcessor::class
    )
    class TestConfiguration {

    }

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    internal fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testBeanFactoryProcessor() {
        val foo = applicationContext.getBean(Foo::class.java)
        Assertions.assertNotNull(foo)
    }

}