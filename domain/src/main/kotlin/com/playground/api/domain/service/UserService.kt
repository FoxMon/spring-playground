package com.playground.api.domain.service

import com.playground.api.domain.entity.User
import dto.UserResponseDto

interface UserService {
    fun getUserByName(name: String): UserResponseDto
}