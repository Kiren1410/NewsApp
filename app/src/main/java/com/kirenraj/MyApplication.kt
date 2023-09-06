package com.kirenraj

import android.app.Application
import androidx.room.Room
import com.kirenraj.data.AccountDataBase
import com.kirenraj.data.repo.AccountRepo

class MyApplication: Application() {
    lateinit var accountRepo: AccountRepo

    override fun onCreate() {
        super.onCreate()

        val accountRepo = Room.databaseBuilder(
            this,
            AccountDataBase::class.java,
            AccountDataBase.name
        )
            .fallbackToDestructiveMigration()
            .build()

        accountRepo
    }
}