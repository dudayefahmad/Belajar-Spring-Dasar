package com.ahmaddudayef.belajarspringdasar.scope

import org.springframework.beans.factory.ObjectFactory
import org.springframework.beans.factory.config.Scope


class DoubletonScop : Scope {

    private val objects: ArrayList<Any> = ArrayList(2)
    private var counter: Long = -1L

    override fun get(name: String, objectFactory: ObjectFactory<*>): Any {
        counter++

        if (objects.size == 2) {
            val index = (counter % 2).toInt()
            return objects.get(index)
        } else {
            val obj = objectFactory.`object`
            objects.add(obj)
            return obj
        }
    }

    override fun remove(name: String): Any? {
        if (!objects.isEmpty()) {
            return objects.remove(0)
        }
        return null
    }

    override fun registerDestructionCallback(name: String, callback: Runnable) {
        TODO("Not yet implemented")
    }

    override fun resolveContextualObject(key: String): Any? {
        TODO("Not yet implemented")
    }

    override fun getConversationId(): String? {
        TODO("Not yet implemented")
    }
}