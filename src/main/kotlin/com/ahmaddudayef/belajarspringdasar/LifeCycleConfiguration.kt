package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.Connection
import com.ahmaddudayef.belajarspringdasar.data.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LifeCycleConfiguration {

    @Bean
    fun connection(): Connection = Connection()

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    fun server(): Server = Server()
}