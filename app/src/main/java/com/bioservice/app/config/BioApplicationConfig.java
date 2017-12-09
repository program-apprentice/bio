package com.bioservice.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.bioservice.app.resource"
})
public class BioApplicationConfig {

}
