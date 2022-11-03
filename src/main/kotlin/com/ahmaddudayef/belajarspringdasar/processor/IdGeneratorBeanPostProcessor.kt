package com.ahmaddudayef.belajarspringdasar.processor

import com.ahmaddudayef.belajarspringdasar.aware.IdAware
import mu.KotlinLogging
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.core.Ordered
import org.springframework.stereotype.Component
import java.util.*

private val logger = KotlinLogging.logger {}

@Component
class IdGeneratorBeanPostProcessor : BeanPostProcessor, Ordered {

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        logger.info("Id Generator Processor for Bean {}", beanName);
        if (bean is IdAware) {
            logger.info("Set Id Generator for Bean {}", beanName)
            val idAware: IdAware = bean
            idAware.set_Id(UUID.randomUUID().toString())
        }
        return bean
    }

    override fun getOrder(): Int {
        return 1
    }
}