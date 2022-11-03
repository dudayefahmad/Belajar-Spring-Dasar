package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.configuration.BarConfiguration
import com.ahmaddudayef.belajarspringdasar.configuration.FooConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(
    FooConfiguration::class,
    BarConfiguration::class
)
class MainConfiguration {


}