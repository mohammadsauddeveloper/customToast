package com.example.customtoast

import android.content.Context
import android.widget.Toast

object CustomToast {
    private var toast: Toast?=null
    fun Context.showToast(message: String){
        toast?.cancel()
        toast = Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT)
        toast?.show()
    }
}