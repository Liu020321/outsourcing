package com.out.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        //用户路由
        registry.addViewController("/login").setViewName("user/sign-in");
        registry.addViewController("/logout").setViewName("user/sign-up");
        //空白路由
        registry.addViewController("/blank").setViewName("blank-page");
        //3D操作路由
        registry.addViewController("/importPictures").setViewName("3D_Operate/importPictures");
        registry.addViewController("/viewResult").setViewName("3D_Operate/viewResult");
        registry.addViewController("/historicalAnalysis").setViewName("3D_Operate/historicalAnalysis");
        registry.addViewController("/viewPicture").setViewName("3D_Operate/viewPicture");
        //医患操作
        registry.addViewController("/checkRegistration").setViewName("patient/checkRegistration");
        registry.addViewController("/processRecord").setViewName("patient/processRecord");

        //治疗操作
        registry.addViewController("/inHospital").setViewName("govern/inHospital");
        registry.addViewController("/medicare").setViewName("govern/medicare");
        registry.addViewController("/prescribe").setViewName("govern/prescribe");

        registry.addViewController("/med").setViewName("/examples/index.html");

    }
}
