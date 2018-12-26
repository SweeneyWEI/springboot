package com.org;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.HttpMessageConverter;

@MapperScan("com.org.dao")
@SpringBootApplication
public class Application {
    @Configuration
    @Profile("prod")
    @PropertySource("classpath:/application-prod.properties")
    class Production {
    }
    @Configuration
    @Profile("dev")
    @PropertySource("classpath:/application-dev.properties")
    class Dev {
    }

    @Bean
    public HttpMessageConverter fastJsonHttpMessageConverters(){
        FastJsonHttpMessageConverter fastConverter=new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(

        )
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



}
