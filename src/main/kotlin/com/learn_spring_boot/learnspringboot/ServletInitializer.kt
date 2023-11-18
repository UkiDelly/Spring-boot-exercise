package com.learn_spring_boot.learnspringboot

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

class ServletInitializer : SpringBootServletInitializer() {
	
	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(LearnSpringBootExerciseApplication::class.java)
	}
	
}
