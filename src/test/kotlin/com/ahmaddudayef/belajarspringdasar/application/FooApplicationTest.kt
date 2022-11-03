package com.ahmaddudayef.belajarspringdasar.application

import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest(classes = [FooApplication::class])
class FooApplicationTest {

    @Autowired
    var foo: Foo? = null

    @Test
    fun testSpringBoot() {
        Assertions.assertNotNull(foo)
    }
}