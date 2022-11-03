package com.ahmaddudayef.belajarspringdasar.client

data class PaymentGatewayClient(
    var endPoint: String,
    var privateKey: String,
    var publicKey: String
)