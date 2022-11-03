package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.data.MultiFoo
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan(
    basePackages = [
        "com.ahmaddudayef.belajarspringdasar.repository",
        "com.ahmaddudayef.belajarspringdasar.service",
        "com.ahmaddudayef.belajarspringdasar.configuration"
    ]
)
@Import(MultiFoo::class)
class ComponentConfiguration {
}