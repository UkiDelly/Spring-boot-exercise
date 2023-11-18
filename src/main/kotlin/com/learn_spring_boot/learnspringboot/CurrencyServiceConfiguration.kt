package com.learn_spring_boot.learnspringboot

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "currency-service")
@Component
class CurrencyServiceConfiguration {
	
	lateinit var url: String
	lateinit var username: String
	lateinit var key: String
}

