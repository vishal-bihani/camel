/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milvus;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MilvusComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.milvus.MilvusConfiguration getOrCreateConfiguration(MilvusComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.milvus.MilvusConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MilvusComponent target = (MilvusComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.milvus.MilvusConfiguration.class, value)); return true;
        case "host": getOrCreateConfiguration(target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "port": getOrCreateConfiguration(target).setPort(property(camelContext, int.class, value)); return true;
        case "timeout": getOrCreateConfiguration(target).setTimeout(property(camelContext, long.class, value)); return true;
        case "token": getOrCreateConfiguration(target).setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "configuration": return org.apache.camel.component.milvus.MilvusConfiguration.class;
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "port": return int.class;
        case "timeout": return long.class;
        case "token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MilvusComponent target = (MilvusComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "configuration": return target.getConfiguration();
        case "host": return getOrCreateConfiguration(target).getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "port": return getOrCreateConfiguration(target).getPort();
        case "timeout": return getOrCreateConfiguration(target).getTimeout();
        case "token": return getOrCreateConfiguration(target).getToken();
        default: return null;
        }
    }
}

