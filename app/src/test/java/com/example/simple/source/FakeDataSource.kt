package com.example.simple.source

import androidx.lifecycle.LiveData
import com.example.simple.Result
import com.example.simple.Result.Error
import com.example.simple.Result.Success
import com.example.simple.Task
import com.example.simple.TasksDataSource

class FakeDataSource(var tasks: MutableList<Task>? = mutableListOf()) : TasksDataSource {
    override suspend fun getTasks(): Result<List<Task>> {
        tasks?.let { return Success(ArrayList(it)) }
        return Error(
            Exception("Tasks not found")
        )
    }

    override fun observeTasks(): LiveData<Result<List<Task>>> {
        TODO("not implemented")
    }

    override suspend fun refreshTasks() {
        TODO("not implemented")
    }

    override fun observeTask(taskId: String): LiveData<Result<Task>> {
        TODO("not implemented")
    }

    override suspend fun getTask(taskId: String): Result<Task> {
        TODO("not implemented")
    }

    override suspend fun refreshTask(taskId: String) {
        TODO("not implemented")
    }

    override suspend fun saveTask(task: Task) {
        tasks?.add(task)
    }

    override suspend fun completeTask(task: Task) {
        TODO("not implemented")
    }

    override suspend fun completeTask(taskId: String) {
        TODO("not implemented")
    }

    override suspend fun activateTask(task: Task) {
        TODO("not implemented")
    }

    override suspend fun activateTask(taskId: String) {
        TODO("not implemented")
    }

    override suspend fun clearCompletedTasks() {
        TODO("not implemented")
    }

    override suspend fun deleteAllTasks() {
        tasks?.clear()
    }

    override suspend fun deleteTask(taskId: String) {
        TODO("not implemented")
    }

}