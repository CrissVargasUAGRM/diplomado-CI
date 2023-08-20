package com.nur;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        exclude = {
                org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration.class,
                org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration.class,
                org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration.class,
        }
)
@OpenAPIDefinition(info = @Info(title = "NurBnB microservices", version = "1.0.0"))
public class CheckInApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheckInApiApplication.class, args);
    }
}
