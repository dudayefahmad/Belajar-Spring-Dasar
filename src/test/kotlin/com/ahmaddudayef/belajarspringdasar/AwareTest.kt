package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.service.AuthService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

class AwareTest {

    @Configuration
    @Import(
        AuthService::class
    )
    class TestConfiguration {

    }

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(TestConfiguration::class.java)
        applicationContext.registerShutdownHook()
    }

    @Test
    fun testAware() {
        var authService = applicationContext.getBean(AuthService::class.java)

        Assertions.assertEquals("com.ahmaddudayef.belajarspringdasar.service.AuthService", authService.beanAuthName)
        Assertions.assertNotNull(authService.applicationCtx)
        Assertions.assertSame(applicationContext, authService.applicationCtx)
    }
}