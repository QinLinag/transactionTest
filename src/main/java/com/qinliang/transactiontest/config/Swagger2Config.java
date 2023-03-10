package com.qinliang.transactiontest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("qinliang")   //分组，   一个组就要创建一个bean   A B C组
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qinliang.transactiontest.controller"))  //指定扫描包下的接口api
                .build();
    }

    private ApiInfo apiInfo(){

        Contact contact = new Contact("秦亮","http://localhost:8000/","2874974475@qq.com");

        return new ApiInfo(
                "秦亮的api日记",
                "秦亮学习swagger2",
                "1.0",
                "http://localhost:8000/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }


}
