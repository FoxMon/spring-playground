package com.playground.api.web

import com.playground.api.domain.service.UserService
import dto.UserResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController (
    private val userService: UserService
) {
    @GetMapping("/{name}")
    fun getUserByName(@PathVariable("name") name: String): UserResponseDto = this.userService.getUserByName(name)
}