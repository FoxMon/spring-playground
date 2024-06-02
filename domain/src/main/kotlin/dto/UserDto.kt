package dto

import java.time.Instant

data class UserResponse(
    val out: UserDetailResponse,
) {
    data class UserDetailResponse(
        val result: ResponseDetail? = null,
    ) {
        data class ResponseDetail(
            val id: Long,
            val name: String,
            val nickname: String,
            val createdAt: Instant,
        )

        companion object {
            fun of(id: Long, name: String, nickname: String, createdAt: Instant): UserDetailResponse {
                return UserDetailResponse(
                    result = ResponseDetail(
                        id = id,
                        name = name,
                        nickname = nickname,
                        createdAt = createdAt
                    )
                )
            }
        }
    }

    companion object {
        fun of(id: Long, name: String, nickname: String, createdAt: Instant): UserResponse {
            return UserResponse(
                out = UserDetailResponse.of(id, name, nickname, createdAt)
            )
        }
    }
}