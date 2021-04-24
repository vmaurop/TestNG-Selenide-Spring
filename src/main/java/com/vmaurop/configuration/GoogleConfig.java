package com.vmaurop.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import java.net.URL;

@Configuration
@ConfigurationProperties(prefix = "google")
@Validated
@Getter
@Setter
public class GoogleConfig {
    private URL url;
    private URL urlAPI;

}
