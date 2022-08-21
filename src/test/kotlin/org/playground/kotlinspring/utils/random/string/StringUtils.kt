package org.playground.kotlinspring.utils.random.string

import org.apache.commons.lang3.RandomStringUtils

private const val defaultStringLength: Int = 20

fun randomString(): String {
    return RandomStringUtils.random(defaultStringLength);
}

