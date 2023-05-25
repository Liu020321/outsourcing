package com.out.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("../public/index");
        registry.addViewController("/index.html").setViewName("../public/index");
        registry.addViewController("/dashboard-2.html").setViewName("dashboard-2");
        registry.addViewController("/login").setViewName("sign-in");
        registry.addViewController("/logout").setViewName("sign-up");
        registry.addViewController("/blank").setViewName("blank-page");
    }
}
