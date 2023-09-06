package com.kirenraj.data.repo

import com.google.android.gms.tasks.Task
import com.kirenraj.data.Account.Account
import com.kirenraj.data.AccountDao
import kotlinx.coroutines.flow.Flow

class AccountRepo(
    private val dao: AccountDao
) {
    fun getAccounts() : Flow<List<Account>> {
        return dao.getAccounts()
    }

    fun addAccount(account: Account) {
        dao.insertAccount(account)
    }

    fun updateAccount(account: Account) {
        dao.updateAccount(account)
    }
}