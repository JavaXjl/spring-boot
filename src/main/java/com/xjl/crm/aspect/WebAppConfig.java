package com.xjl.crm.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lenovo on 2018/8/23.
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurationSupport{


    public void addInterceptors(InterceptorRegistry registry){

        List<String> list = new ArrayList<>();
        list.add("/user/**");
        registry.addInterceptor(new WebLogAspect()).addPathPatterns(list);
    }
}
