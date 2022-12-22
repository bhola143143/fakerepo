package com.example.simple

import android.app.Application
import androidx.databinding.ktx.BuildConfig

import timber.log.Timber
import timber.log.Timber.DebugTree


class ToApplication : Application() {

    val taskRepository: TasksRepository
        get() = ServiceLocator.provideTasksRepository(this)

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(DebugTree())
    }
}
