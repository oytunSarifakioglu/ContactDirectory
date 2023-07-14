package com.example.mvvm.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvm.database.ContactDao
import com.example.mvvm.model.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase: RoomDatabase() {

    abstract val dao : ContactDao

}