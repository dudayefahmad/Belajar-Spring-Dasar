package com.ahmaddudayef.belajarspringdasar.runnerapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RunnerApplication {
}

fun main(args: Array<String>) {
    SpringApplication.run(RunnerApplication::class.java, *args)
}