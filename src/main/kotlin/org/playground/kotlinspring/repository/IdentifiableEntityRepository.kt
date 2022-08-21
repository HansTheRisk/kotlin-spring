package org.playground.kotlinspring.repository

import org.playground.kotlinspring.repository.entity.identifiable.IdentifiableEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface IdentifiableEntityRepository <T : IdentifiableEntity?>: JpaRepository<T, UUID>
