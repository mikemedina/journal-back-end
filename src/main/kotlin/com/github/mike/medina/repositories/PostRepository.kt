package com.github.mike.medina.repositories

import com.github.mike.medina.entities.Post
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.CrossOrigin


@CrossOrigin("http://localhost:8000")
@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
interface PostRepository : PagingAndSortingRepository<Post, Long>
