package com.ahmaddudayef.belajarspringdasar

import com.ahmaddudayef.belajarspringdasar.service.MerchantServiceImpl
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(MerchantServiceImpl::class)
class InheritanceConfiguration {
}