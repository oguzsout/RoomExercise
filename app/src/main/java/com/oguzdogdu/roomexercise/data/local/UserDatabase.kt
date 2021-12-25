package com.oguzdogdu.roomexercise.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.oguzdogdu.roomexercise.domain.model.User

@Database(entities = [User::class],version = 2)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}