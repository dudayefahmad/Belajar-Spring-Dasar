package com.ahmaddudayef.belajarspringdasar.data

import org.springframework.beans.factory.ObjectProvider
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.stream.Collectors


@Component
class MultiFoo {

    lateinit var foos: List<Foo>

    @Autowired
    fun MultiFoo(objectProvider: ObjectProvider<Foo>) {
        foos = objectProvider.stream().collect(Collectors.toList())
    }

}