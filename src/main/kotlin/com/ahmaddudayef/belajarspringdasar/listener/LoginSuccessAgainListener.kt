package com.ahmaddudayef.belajarspringdasar.listener

import com.ahmaddudayef.belajarspringdasar.event.LoginSuccessEvent
import mu.KotlinLogging
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class LoginSuccessAgainListener : ApplicationListener<LoginSuccessEvent> {

    override fun onApplicationEvent(event: LoginSuccessEvent) {
        logger.info("Success login again for user {}", event.user)
    }
}