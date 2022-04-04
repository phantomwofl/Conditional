package com.nikulin.springnetology;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(prefix = "netology", value = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

//    @ConditionalOnProperty(name="netology.profile.dev", havingValue="false")
    @ConditionalOnProperty(prefix = "netology", value = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
