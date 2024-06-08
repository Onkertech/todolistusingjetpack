package com.vk.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id:Int,
    var title:String,
    var createdAt: Date
)
   @RequiresApi(Build.VERSION_CODES.O)
   fun getFakeTodo():List<Todo>{
       return listOf<Todo>(
           Todo(1,"Firts todo",Date.from(Instant.now())),
           Todo(2,"second todo",Date.from(Instant.now())),
           Todo(3,"third todo",Date.from(Instant.now())),
           Todo(4,"fourth todo",Date.from(Instant.now()))
       );
   }