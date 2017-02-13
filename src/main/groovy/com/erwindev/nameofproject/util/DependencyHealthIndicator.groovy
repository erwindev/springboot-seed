package com.erwindev.nameofproject.util

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component

@Component
class DependencyHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		int errorCode = check(); // perform some specific health check on a dependency
		if (errorCode != 0) {
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}

	public int check() {
		//TODO: Add logic to check health status (i.e. rest call to dependency service service)
		return 0;
	}
}
