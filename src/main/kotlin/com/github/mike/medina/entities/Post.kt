package com.github.mike.medina.entities

import javax.persistence.*

@Entity
@Table(name="city")
data class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,
        val content: String
)
