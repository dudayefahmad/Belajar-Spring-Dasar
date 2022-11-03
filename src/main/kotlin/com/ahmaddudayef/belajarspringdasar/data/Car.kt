package com.ahmaddudayef.belajarspringdasar.data

import com.ahmaddudayef.belajarspringdasar.aware.IdAware
import org.springframework.stereotype.Component

@Component
class Car : IdAware {

    lateinit var id: String

    override fun set_Id(id: String) {
        this.id = id
    }

    override fun get_Id(): String {
        return id
    }
}