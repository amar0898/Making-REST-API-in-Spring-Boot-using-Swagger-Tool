package com.upgrad.SwaggerExample.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.nio.charset.StandardCharsets;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket authorAPI(){

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com/upgrad/SwaggerExample/controller/AuthorController.java"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(metaData());

    };

    public ApiInfo metaData(){

        ApiInfo info = new ApiInfo(
                "SpringBootApplication",
                "API for Author's Info",
                "1.0.1",
                "https://upgrad.com/terms",
                "Upgrad Education",
                "Licensed Under Upgrad",
                "https://upgrad.com"
        );

     return info;
    }


}