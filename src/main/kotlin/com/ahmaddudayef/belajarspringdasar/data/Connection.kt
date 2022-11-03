package com.ahmaddudayef.belajarspringdasar.data

import mu.KotlinLogging
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean

private val logger = KotlinLogging.logger {}

class Connection : InitializingBean, DisposableBean {

    override fun afterPropertiesSet() {
        logger.info("Connection is ready to be used")
    }

    override fun destroy() {
        logger.info("Connection is closed")
    }
}