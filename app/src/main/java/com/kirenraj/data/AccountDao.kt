package com.kirenraj.data

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.kirenraj.data.Account.Account
import kotlinx.coroutines.flow.Flow

interface AccountDao {
    @Query("SELECT * FROM account")
    fun getAccounts(): Flow<List<Account>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAccount(account: Account)

    @Update
    fun updateAccount(account: Account)
}