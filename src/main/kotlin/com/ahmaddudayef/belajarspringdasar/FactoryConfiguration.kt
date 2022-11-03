package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.factory.PaymentGatewayClientFactoryBean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(
    PaymentGatewayClientFactoryBean::class
)
class FactoryConfiguration {
}