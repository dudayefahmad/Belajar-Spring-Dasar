package com.ahmaddudayef.belajarspringdasar.data

import mu.KotlinLogging
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

private val logger = KotlinLogging.logger {}

class Server {

    @PostConstruct
    fun start() {
        logger.info("Start Server")
    }

    @PreDestroy
    fun stop() {
        logger.info("Stop Server")
    }
}