package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Car
import com.ahmaddudayef.belajarspringdasar.processor.IdGeneratorBeanPostProcessor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

class BeanPostProcessorTest {

    @Configuration
    @Import(
        Car::class,
        IdGeneratorBeanPostProcessor::class
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
    fun testCar() {
        val car = applicationContext.getBean(Car::class.java)
        println(car.id)
        Assertions.assertNotNull(car.id)
    }
}