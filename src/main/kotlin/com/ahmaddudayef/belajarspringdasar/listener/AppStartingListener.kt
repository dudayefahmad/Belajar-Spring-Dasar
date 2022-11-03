package com.ahmaddudayef.belajarspringdasar.listener

import mu.KotlinLogging
import org.springframework.boot.context.event.ApplicationStartingEvent
import org.springframework.context.ApplicationListener

private val logger = KotlinLogging.logger {}

class AppStartingListener : ApplicationListener<ApplicationStartingEvent> {

    override fun onApplicationEvent(event: ApplicationStartingEvent) {
        logger.info("Application Starting")
    }

}