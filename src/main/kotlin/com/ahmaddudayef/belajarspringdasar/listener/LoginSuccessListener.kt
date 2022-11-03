package com.ahmaddudayef.belajarspringdasar.listener

import com.ahmaddudayef.belajarspringdasar.event.LoginSuccessEvent
import mu.KotlinLogging
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class LoginSuccessListener : ApplicationListener<LoginSuccessEvent> {

    override fun onApplicationEvent(event: LoginSuccessEvent) {
        logger.info("Success login for user {}", event.user)
    }
}