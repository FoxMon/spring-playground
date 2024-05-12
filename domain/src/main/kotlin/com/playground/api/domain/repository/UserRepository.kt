package com.playground.api.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.playground.api.domain.entity.User

interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User
}