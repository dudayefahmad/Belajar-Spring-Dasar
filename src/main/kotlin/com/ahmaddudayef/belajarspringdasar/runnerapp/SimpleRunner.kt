package com.ahmaddudayef.belajarspringdasar.runnerapp

import mu.KotlinLogging
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class SimpleRunner : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        val profiles = args?.getOptionValues("profiles")
        logger.info("Profiles : {}", profiles)
    }
}