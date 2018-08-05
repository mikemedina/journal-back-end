package com.github.mike.medina

import com.github.mike.medina.entities.Post
import com.github.mike.medina.entities.User
import com.github.mike.medina.repositories.PostRepository
import com.github.mike.medina.repositories.UserRepository
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Preloader(
        private val postRepository: PostRepository,
        private val userRepository: UserRepository
) {

    @PostConstruct
    fun preload() {
        postRepository.save(Post(null, "post 1"))
        postRepository.save(Post(null, "post 2"))
        postRepository.save(Post(null, "post 3"))
        postRepository.save(Post(null, "post 4"))

        userRepository.save(User(null, "user 1"))
        userRepository.save(User(null, "user 2"))
        userRepository.save(User(null, "user 3"))
    }

}
