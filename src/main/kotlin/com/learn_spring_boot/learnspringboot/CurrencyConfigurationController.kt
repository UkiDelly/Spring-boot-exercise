package com.learn_spring_boot.learnspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/currency-configuration")
class CurrencyConfigurationController(
	@Autowired
	private val configuration: CurrencyServiceConfiguration
) {
	
	
	@GetMapping
	fun retrieveAllCourses(): CurrencyServiceConfiguration {
		return configuration
	}
}