package com.ahmaddudayef.belajarspringdasar.event

import com.ahmaddudayef.belajarspringdasar.data.User
import org.springframework.context.ApplicationEvent

class LoginSuccessEvent(user: User) : ApplicationEvent(user) {

    val user: User

    init {
        this.user = user
    }
}