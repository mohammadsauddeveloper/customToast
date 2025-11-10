package com.example.customtoast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

object CustomToast {
    private var toast: Toast?=null
    fun Context.showToast(message: String,backgroundColor: Int,textColor:Int){
        val view = LayoutInflater.from(this).inflate(R.layout.custom_toast,null)
        val text = view.findViewById<TextView>(R.id.tvToast)
        val card = view.findViewById<LinearLayout>(R.id.card)
        text.text = message
        card.setBackgroundColor(ContextCompat.getColor(this, backgroundColor))
        text.setTextColor(ContextCompat.getColor(this, textColor))
        toast?.cancel()
        toast = Toast(this)
        toast?.duration = Toast.LENGTH_SHORT
        toast?.view = view
        toast?.setGravity(Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL, 0,100)
        toast?.show()

    }
}