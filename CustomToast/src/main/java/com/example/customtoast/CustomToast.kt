package com.example.customtoast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

object CustomToast {
    private var toast: Toast?=null
    fun Context.showToast(message: String){
        val view = LayoutInflater.from(this).inflate(R.layout.custom_toast,null)
        val text = view.findViewById<TextView>(R.id.tvToast)
        text.text = message
        toast?.cancel()
        toast = Toast(this)
        toast?.duration = Toast.LENGTH_SHORT
        toast?.view = view
        toast?.setGravity(Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL, 0,100)
        toast?.show()

    }
}