package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Connection
import com.ahmaddudayef.belajarspringdasar.data.Server
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class LifeCycleTest {

    private lateinit var applicationContext: ConfigurableApplicationContext

    @BeforeEach
    fun setUp() {
        applicationContext = AnnotationConfigApplicationContext(LifeCycleConfiguration::class.java)
        applicationContext.registerShutdownHook() //auto teardown
    }

    @Test
    fun testConnection() {
        val connection = applicationContext.getBean(Connection::class.java)
    }

    @AfterEach
    fun tearDown() {
//        applicationContext.close()
    }

    @Test
    fun testServer() {
        val server = applicationContext.getBean(Server::class.java)
    }
}