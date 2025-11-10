package com.example.customtoast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

object CustomToast {
    private var toast: Toast?=null
    fun Context.showToast(message: String,color: Int){
        val view = LayoutInflater.from(this).inflate(R.layout.custom_toast,null)
        val text = view.findViewById<TextView>(R.id.tvToast)
        val card = view.findViewById<CardView>(R.id.card)
        text.text = message
        card.setBackgroundResource(color)
        toast?.cancel()
        toast = Toast(this)
        toast?.duration = Toast.LENGTH_SHORT
        toast?.view = view
        toast?.setGravity(Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL, 0,100)
        toast?.show()

    }
}