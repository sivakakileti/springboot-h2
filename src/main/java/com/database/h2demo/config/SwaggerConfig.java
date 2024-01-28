package com.database.h2demo.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
        @Bean
        public GroupedOpenApi controllerApi() {
            return GroupedOpenApi.builder()
                    .group("employee-apis")
                    .packagesToScan("com.database.h2demo")
                    .build();
        }



    }
