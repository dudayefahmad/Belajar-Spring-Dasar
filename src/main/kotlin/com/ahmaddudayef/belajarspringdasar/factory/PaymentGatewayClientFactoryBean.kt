package com.ahmaddudayef.belajarspringdasar.factory

import com.ahmaddudayef.belajarspringdasar.client.PaymentGatewayClient
import org.springframework.beans.factory.FactoryBean
import org.springframework.stereotype.Component

@Component("paymentGatewayClient")
class PaymentGatewayClientFactoryBean : FactoryBean<PaymentGatewayClient> {

    override fun getObject(): PaymentGatewayClient? {
        return PaymentGatewayClient(
            endPoint = "https://example.com",
            privateKey = "private",
            publicKey = "public"
        )
    }

    override fun getObjectType(): Class<*>? {
        return PaymentGatewayClient::class.java
    }


}