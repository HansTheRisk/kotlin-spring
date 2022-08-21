package org.playground.kotlinspring.repository.user

import org.playground.kotlinspring.repository.entity.identifiable.IdentifiableEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
class User(
 var username: String,
 var name: String,
 var surname: String,
 var description: String?
): IdentifiableEntity()