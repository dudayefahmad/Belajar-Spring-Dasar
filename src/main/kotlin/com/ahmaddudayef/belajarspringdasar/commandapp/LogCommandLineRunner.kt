package com.ahmaddudayef.belajarspringdasar.commandapp

import mu.KotlinLogging
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class LogCommandLineRunner : CommandLineRunner {

    override fun run(vararg args: String?) {
        logger.info("Run with args: {}", args.contentToString())
    }

}