package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.listener.LoginSuccessAgainListener
import com.ahmaddudayef.belajarspringdasar.listener.LoginSuccessListener
import com.ahmaddudayef.belajarspringdasar.listener.UserListener
import com.ahmaddudayef.belajarspringdasar.service.UserService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import


class EventListenerTest {

    @Configuration
    @Import(
        UserService::class,
        LoginSuccessListener::class,
        LoginSuccessAgainListener::class,
        UserListener::class
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
    fun testEvent() {
        val userService = applicationContext.getBean(UserService::class.java)
        userService.login("admin", "admin")
        userService.login("admin", "user")
        userService.login("user", "admin")
    }
}