package com.example.simple.local

import androidx.room.Database
import androidx.room.RoomDatabase

import com.example.simple.Task


@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ToDatabase : RoomDatabase() {

    abstract fun taskDao(): TasksDao
}
