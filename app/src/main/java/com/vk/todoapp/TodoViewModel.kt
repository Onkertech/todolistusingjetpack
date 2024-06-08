package com.vk.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel:ViewModel() {
    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList :LiveData<List<Todo>> =_todoList

    fun getAlltodo(){
        _todoList.value = TodoManager.getAlltodo().reversed()
        }
    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title:String){
        TodoManager.addTodo(title)
        getAlltodo()

    }
    fun deleteTodo(id:Int){
        TodoManager.deleteTodo(id)
        getAlltodo()

    }

}