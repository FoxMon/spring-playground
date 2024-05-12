package com.playground.api.domain.service

import com.playground.api.domain.entity.User
import com.playground.api.domain.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserServiceImpl (
    private val userRepository: UserRepository
) : UserService {
    override fun getUserByName(name: String): User = this.userRepository.findByName((name))
}