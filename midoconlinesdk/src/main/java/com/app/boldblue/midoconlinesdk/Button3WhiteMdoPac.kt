package com.app.boldblue.midoconlinesdk

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class Button3WhiteMdoPac @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int=0,
    defStyleRes : Int = 0
): LinearLayout(context,attrs,defStyle,defStyleRes){
    init {
        LayoutInflater.from(context).inflate(R.layout.button3_white_mdopac,this,true)
        val btnMdoPac = findViewById<CardView>(R.id.btnMdoPaciente)
        btnMdoPac.setOnClickListener {
            val intent = Intent(context, ActivityWebViewMdoPac::class.java)
            context.startActivity(intent)
        }
    }
}