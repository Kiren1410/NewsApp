package com.kirenraj.data.Account

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Account(
    @PrimaryKey(autoGenerate = true)
    val username: String,
    val email: String,
    val password: String,
)
