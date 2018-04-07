package com.springframework.springframework.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    // These methods will be called for each Bean in the Application Context.

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        // We want to do something only if the Bean is of type `LifeCycleDemoBean`
        // which we have in the current package.
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
