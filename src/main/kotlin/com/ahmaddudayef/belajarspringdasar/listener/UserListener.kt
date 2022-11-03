package com.ahmaddudayef.belajarspringdasar.listener

import com.ahmaddudayef.belajarspringdasar.event.LoginSuccessEvent
import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class UserListener {

    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent(event: LoginSuccessEvent) {
        logger.info("Success login for user {}", event.user)
    }

    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent2(event: LoginSuccessEvent) {
        logger.info("Success login for user {}", event.user)
    }

    @EventListener(classes = [LoginSuccessEvent::class])
    fun onLoginSuccessEvent3(event: LoginSuccessEvent) {
        logger.info("Success login for user {}", event.user)
    }

}