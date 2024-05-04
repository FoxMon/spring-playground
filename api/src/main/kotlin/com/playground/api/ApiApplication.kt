package com.playground.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = ["com.playground.api"])
@ConfigurationPropertiesScan
class ApiApplication
fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
