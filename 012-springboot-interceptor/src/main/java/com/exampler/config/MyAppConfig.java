package com.exampler.config;

import com.exampler.filter.MyFilter;
import com.exampler.servlet.MyServlet;
import com.exampler.web.LoginInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/27 17:19
 */

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        HandlerInterceptor interceptor = new LoginInterceptor();

        String path[] = {"/user/**"};

        String excludePath[] = {"/user/login"};

        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);

    }

    @Bean
    public String a(){
        return "a";
    }


    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/b");



        return bean;

    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean bean = new FilterRegistrationBean();

        CharacterEncodingFilter filter = new CharacterEncodingFilter();

        filter.setEncoding("utf-8");

        filter.setForceEncoding(true);
        bean.setFilter(filter);
        bean.addUrlPatterns("/*");

        return bean;

    }

}
