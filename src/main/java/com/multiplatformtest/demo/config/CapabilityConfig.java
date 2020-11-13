package com.multiplatformtest.demo.config;

import com.multiplatformtest.demo.model.Capability;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CapabilityConfig {

    @Bean
    @ConfigurationProperties("capability")
    public Capability mobileCapability() {
        return new Capability();
    }

}
