package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Car
import com.ahmaddudayef.belajarspringdasar.processor.IdGeneratorBeanPostProcessor
import com.ahmaddudayef.belajarspringdasar.processor.PrefixIdGeneratorBeanPostProcessor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import


class OrderedTest {

    @Configuration
    @Import(Car::class,
        IdGeneratorBeanPostProcessor::class,
        PrefixIdGeneratorBeanPostProcessor::class)
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
        println(car.get_Id())
        Assertions.assertNotNull(car.get_Id())
        Assertions.assertTrue(car.get_Id().startsWith("PZN-"))
    }
}