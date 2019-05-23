package com.feibai.springmvc4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 18:11 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 18:11 2019/5/23
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.feibai.springmvc4")
public class MyMvcConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

}
