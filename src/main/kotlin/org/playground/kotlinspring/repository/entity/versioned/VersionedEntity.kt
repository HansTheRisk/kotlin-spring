package org.playground.kotlinspring.repository.entity.versioned

import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
abstract class VersionedEntity {
    @Version
    var version: Int = 0
}