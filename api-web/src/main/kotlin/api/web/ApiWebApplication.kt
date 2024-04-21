package com.playground.api.web

import com.playground.api.core.ApiCore
import com.playground.api.domain.ApiDomain
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackageClasses = [ApiCore::class, ApiDomain::class, ApiWebApplication::class],
)
class ApiWebApplication {}

fun main(args: Array<String>) {
    runApplication<ApiWebApplication>(*args)
}