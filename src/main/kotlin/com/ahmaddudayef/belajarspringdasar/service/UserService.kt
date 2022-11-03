package com.ahmaddudayef.belajarspringdasar.service

import com.ahmaddudayef.belajarspringdasar.data.User
import com.ahmaddudayef.belajarspringdasar.event.LoginSuccessEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationEventPublisherAware
import org.springframework.stereotype.Component

@Component
class UserService : ApplicationEventPublisherAware {

    private lateinit var applicationEventPublisher: ApplicationEventPublisher

    override fun setApplicationEventPublisher(applicationEventPublisher: ApplicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher
    }

    fun login(username: String, password: String): Boolean {
        return if(isLoginSuccess(username, password)){
            applicationEventPublisher.publishEvent(LoginSuccessEvent(User(username)));
            true;
        }else{
            false;
        }
    }

    private fun isLoginSuccess(username: String, password: String): Boolean {
        return "admin" == username && "admin" == password
    }
}