package com.playground.api.domain.service

import com.playground.api.domain.entity.User

interface UserService {
    fun getUserByName(name: String): User
}