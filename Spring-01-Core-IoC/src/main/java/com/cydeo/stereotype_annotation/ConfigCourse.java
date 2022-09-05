package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
        // Can be accessible from different packages
//@ComponentScan(basePackages = "com.cydeo")
public class ConfigCourse {
}
