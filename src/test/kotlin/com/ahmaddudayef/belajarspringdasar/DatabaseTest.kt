package com.ahmaddudayef.belajarspringdasar

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class DatabaseTest {

    @Test
    fun testSingleton() {
        val database1 = Database.instance
        val database2 = Database.instance
        Assertions.assertSame(database1, database2)
    }
}