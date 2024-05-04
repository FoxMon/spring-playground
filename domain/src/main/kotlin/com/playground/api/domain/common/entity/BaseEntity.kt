package com.playground.api.domain.common.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {
    @CreatedBy
    @Column(name = "created_by", updatable = false)
    var createdBy: String? = "System"
        protected set

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    var createdAt: Instant = Instant.now()
        protected set
}