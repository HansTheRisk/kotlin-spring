package org.playground.kotlinspring.repository.user

import org.playground.kotlinspring.repository.IdentifiableEntityRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : IdentifiableEntityRepository<User> {
    fun findByUsername(username: String): Optional<User>
}