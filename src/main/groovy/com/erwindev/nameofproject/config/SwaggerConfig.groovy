package com.erwindev.nameofproject.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.http.ResponseEntity
import org.springframework.beans.factory.annotation.Value

import com.mangofactory.swagger.configuration.SpringSwaggerConfig
import com.mangofactory.swagger.models.dto.ApiInfo
import com.mangofactory.swagger.plugin.EnableSwagger
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin

@Configuration
@EnableSwagger
@ComponentScan("com.erwindev.nameofproject.controller")
class SwaggerConfig {
	@Autowired
	private SpringSwaggerConfig springSwaggerConfig;

	@Value('${info.app.name}') String appName
	@Value('${info.app.description}') String appDescription
	@Value('${info.app.contact}') String appContact

	@Bean
	public SwaggerSpringMvcPlugin customPlugin() {
		new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
				.apiInfo(apiInfo())
				.includePatterns("/api/template/v1.*")
	}

	private def apiInfo() {
		new ApiInfo(
				appName,
				appDescription,
				"",
				appContact,
				"",
				""
		)
	}
}
