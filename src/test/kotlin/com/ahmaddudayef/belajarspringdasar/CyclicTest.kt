package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.cyclic.CyclicConfiguration
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class CyclicTest {

    @Test
    fun testCyclic() {
//        val context = AnnotationConfigApplicationContext(CyclicConfiguration::class.java)

        Assertions.assertThrows(Throwable::class.java) {
            val context = AnnotationConfigApplicationContext(CyclicConfiguration::class.java)
        }
    }
}