package com.example.libforproject

import android.content.Context
import android.widget.Toast

object Text {
    fun show(context: Context){
        Toast.makeText(context,"Hello Word",Toast.LENGTH_SHORT).show()
    }
}