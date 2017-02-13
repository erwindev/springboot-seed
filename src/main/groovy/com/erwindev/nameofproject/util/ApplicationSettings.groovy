package com.erwindev.nameofproject.util

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="erwindev")
class ApplicationSettings {
	String apiVersion
}
