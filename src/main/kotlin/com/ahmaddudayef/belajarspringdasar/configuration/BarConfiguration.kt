package com.ahmaddudayef.belajarspringdasar.configuration

import com.ahmaddudayef.belajarspringdasar.data.Bar
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BarConfiguration {

    @Bean
    fun bar(): Bar = Bar()

}