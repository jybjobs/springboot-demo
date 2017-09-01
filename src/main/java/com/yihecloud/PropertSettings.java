package com.yihecloud;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jyb on 17-8-13.
 *
 * info:
 *   基于类型安全的配置方式
 */
@Component
@ConfigurationProperties(prefix = "pros") //将properties属性和Bean 属性关联
public class PropertSettings {
    private  String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
