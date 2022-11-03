package com.ahmaddudayef.belajarspringdasar.service

import org.springframework.beans.factory.BeanNameAware
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component

@Component
class AuthService : ApplicationContextAware, BeanNameAware{

    lateinit var beanAuthName: String

    lateinit var applicationCtx: ApplicationContext

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationCtx = applicationContext
    }

    override fun setBeanName(name: String) {
        this.beanAuthName = name
    }


}