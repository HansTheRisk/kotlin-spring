package org.playground.kotlinspring.repository.entity.identifiable

import org.playground.kotlinspring.repository.entity.versioned.VersionedEntity
import org.springframework.data.domain.Persistable
import java.util.UUID
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class IdentifiableEntity: Persistable<UUID>, VersionedEntity() {
    @Id
    var uuid: UUID = UUID.randomUUID()

    override fun getId(): UUID? {
        return uuid
    }

    override fun isNew(): Boolean {
        return version == 0;
    }

}
