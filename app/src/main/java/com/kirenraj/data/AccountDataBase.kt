package com.kirenraj.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kirenraj.data.Account.Account

@Database(entities = [Account::class], version = 1)
abstract class AccountDataBase:RoomDatabase() {
    abstract val dao :AccountDao
    companion object {
        const val name = "account_database"
    }
}