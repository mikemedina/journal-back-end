package com.github.mike.medina.entities

import javax.persistence.*

@Entity
@Table(name="Users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,
        val username: String
)
