package com.ahmaddudayef.belajarspringdasar

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ApplicationContextTest {

    @Test
    fun testApplicationContext() {
        val context = AnnotationConfigApplicationContext(HelloWorldConfiguration::class.java)
        Assertions.assertNotNull(context)
    }
}