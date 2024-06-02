package com.playground.api.domain.service

import dto.UserResponse

interface UserService {
    fun getUserByName(name: String): UserResponse
}