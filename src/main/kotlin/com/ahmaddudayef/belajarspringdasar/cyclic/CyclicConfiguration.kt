package com.ahmaddudayef.belajarspringdasar.cyclic

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CyclicConfiguration {

    @Bean
    fun cyclicA(cyclicB: CyclicB): CyclicA = CyclicA(cyclicB)

    @Bean
    fun cyclicB(cyclicC: CyclicC): CyclicB = CyclicB(cyclicC)

    @Bean
    fun cyclicC(cyclicA: CyclicA): CyclicC = CyclicC(cyclicA)
}