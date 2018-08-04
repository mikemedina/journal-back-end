package main.kotlin.com.github.mike.medina.controllers

import main.kotlin.com.github.mike.medina.entities.Post
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays.asList

@RestController
class PostController {

    @CrossOrigin(origins = ["http://localhost:8000"])
    @GetMapping("/posts/")
    fun getPosts() = asList(Post(123, "some content"), Post(456, "other stuff"), Post (789, "her"))

}
