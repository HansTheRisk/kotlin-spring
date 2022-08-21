package org.playground.kotlinspring.repository.article

import org.playground.kotlinspring.repository.IdentifiableEntityRepository

interface ArticleRepository: IdentifiableEntityRepository<Article>{
    fun findAllByOrderByAddedAtDesc() : Iterable<Article>
}