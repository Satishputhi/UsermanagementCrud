package com.spring.swagger;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.ApiInfo;
@Configuration
public class SwaggerConfig {
@Bean
public Docket api() {
return new Docket(DocumentationType.SWAGGER_2)
.select()
.apis(RequestHandlerSelectors.basePackage("com.spring.rest")) // Replace with your package name
.paths(PathSelectors.any())
.build()
.apiInfo(apiInfo())
.useDefaultResponseMessages(false)
.host("localhost:8080"); // Set the base URL here
}
private ApiInfo apiInfo() {
return new ApiInfoBuilder()
.title("SSA API Documentation")
.description("Description of your API")
.version("1.0")
.build();
}
}