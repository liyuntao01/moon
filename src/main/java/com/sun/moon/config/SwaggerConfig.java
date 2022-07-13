package com.sun.moon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author li
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 配置swagger2的bean实例
     * @return
     */
    @Bean
    public Docket docket(){
        //Swagger;
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        return docket.apiInfo(ApiInfo.DEFAULT)
                //是否启用swagger
                .enable(true)
                .select()
                /*RequestHandlerSelectors 扫描接口
                basePackage配置要扫描的包
                * any 全部扫描
                * none 都不扫描
                * withMethodAnnotation 扫描类上的注解
                * */
              //  .apis(RequestHandlerSelectors.basePackage("com.offcn.demo"))
                .apis(RequestHandlerSelectors.any())
                /*过滤
                *
                * */
                .paths(PathSelectors.any())
                .build();
    }
    //配置swagger2的
}
