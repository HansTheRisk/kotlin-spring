package org.playground.kotlinspring.repository.article

import org.playground.kotlinspring.repository.entity.identifiable.IdentifiableEntity
import org.playground.kotlinspring.repository.user.User
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne
    var author: User,
    var addedAt: LocalDateTime = LocalDateTime.now(),
): IdentifiableEntity()