package org.playground.kotlinspring.repository.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

import org.playground.kotlinspring.utils.random.string.randomString

@DataJpaTest
class UserRepositoryTest @Autowired constructor(
    private val userRepository: UserRepository) {

    @Test
    fun `When findById then return User`() {
        // given
        var user = getRandomUser();

        // when
        user = userRepository.save(user);

        // then
        val result = userRepository.findById(user.uuid)
        assertThat(user).isEqualTo(result.get())
    }

    @Test
    fun `When findByUsername then return User with matching username`() {
        // given
        var user = getRandomUser();

        // when
        user = userRepository.save(user);

        // then
        val result = userRepository.findByUsername(user.username)
        assertThat(user).isEqualTo(result.get())
    }

    @Test
    fun `When changed User entity is saved then return User with corresponding changes`() {
        // given
        var user = getRandomUser()

        // when
        user = userRepository.saveAndFlush(user)

        user.description = "New description"

        // then
        val result = userRepository.findById(user.id)
        assertThat(user).isEqualTo(result.get())
    }

    private fun getRandomUser(): User {
        return User(randomString(),
                    randomString(),
                    randomString(),
                    randomString())
    }
}