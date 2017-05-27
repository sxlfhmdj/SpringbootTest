package com.deng.online;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.didi.online.dinner.user.controller"))//要扫描的API(Controller)基础包
                .paths(PathSelectors.any())
                .build();
    }
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .build()
                .apiInfo(testApiInfo());
    }
    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
            .title("Electronic Health Record(EHR) Platform API")//大标题
            .description("EHR Platform's REST API, all the applications could access the Object model data via JSON.")//详细描述
            .version("1.0")//版本
            .termsOfServiceUrl("NO terms of service")
            .contact(new Contact("小单", "http://blog.csdn.net/catoop", "365384722@qq.com"))//作者
            .license("The Apache License, Version 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .build();
    }
    private ApiInfo demoApiInfo() {
        return new ApiInfoBuilder()
            .title("Electronic Health Record(EHR) Platform API")//大标题
            .description("EHR Platform's REST API, all the applications could access the Object model data via JSON.")//详细描述
            .version("1.0")//版本
            .termsOfServiceUrl("NO terms of service")
            .contact(new Contact("小单", "http://blog.csdn.net/catoop", "365384722@qq.com"))//作者
            .license("The Apache License, Version 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .build();
    }
    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2 UI构建API文档")
                .contact("土豆")
                .version("1.0")
                .build();
    }

}
