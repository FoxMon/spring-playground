package com.playground.api.domain.service

import com.playground.api.domain.repository.UserRepository
import dto.UserResponseDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserServiceImpl (
    private val userRepository: UserRepository
) : UserService {
    override fun getUserByName(name: String): UserResponseDto {
        val foundUser = this.userRepository.findByName(name)
        return UserResponseDto(
            id = foundUser.id!!,
            name = foundUser.name,
            nickname = foundUser.nickname,
            createdAt = foundUser.createdAt
        )
    }
}