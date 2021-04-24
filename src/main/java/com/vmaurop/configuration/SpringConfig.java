package com.vmaurop.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        GoogleConfig.class
})
@ComponentScan({"com.vmaurop"})
public class SpringConfig {
}
