package com.ahmaddudayef.belajarspringdasar.processor

import com.ahmaddudayef.belajarspringdasar.aware.IdAware
import mu.KotlinLogging
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.Ordered
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class PrefixIdGeneratorBeanPostProcessor : BeanPostProcessor, Ordered {

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        logger.info("Prefix id Generator Processor for Bean {}", beanName);
        if (bean is IdAware) {
            logger.info("Prefix set Id Generator for Bean {}", beanName)
            val idAware: IdAware = bean
            idAware.set_Id("PZN-${idAware.get_Id()}")
        }
        return bean
    }

    override fun getOrder(): Int {
        return 2
    }
}