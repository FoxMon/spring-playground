package dto

import java.time.Instant

data class UserResponseDto (
    val id: Long,
    val name: String,
    val nickname: String,
    val createdAt: Instant
) {
}