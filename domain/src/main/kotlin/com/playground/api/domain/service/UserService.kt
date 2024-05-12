package com.playground.api.domain.service

import dto.UserResponseDto

interface UserService {
    fun getUserByName(name: String): UserResponseDto
}