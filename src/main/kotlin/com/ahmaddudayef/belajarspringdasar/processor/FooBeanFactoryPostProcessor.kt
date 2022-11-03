package com.ahmaddudayef.belajarspringdasar.processor

import com.ahmaddudayef.belajarspringdasar.data.Foo
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.beans.factory.support.GenericBeanDefinition
import org.springframework.stereotype.Component

@Component
class FooBeanFactoryPostProcessor : BeanDefinitionRegistryPostProcessor {

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
        //nothing
    }

    override fun postProcessBeanDefinitionRegistry(registry: BeanDefinitionRegistry) {
        val definition = GenericBeanDefinition()
        definition.apply {
            scope = "singleton"
            setBeanClass(Foo::class.java)
        }
        registry.registerBeanDefinition("foo", definition)
    }

}