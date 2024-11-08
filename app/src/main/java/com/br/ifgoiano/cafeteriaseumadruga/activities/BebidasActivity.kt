package com.br.ifgoiano.cafeteriaseumadruga.activities

import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.br.ifgoiano.cafeteriaseumadruga.R

class BebidasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imgIntent = intent.getIntExtra("img", 0)
        val nomeIntent = intent.getStringExtra("nome")
        val resumoIntent = intent.getStringExtra("resumo")

        val imgDefault: ImageView = findViewById(R.id.fotoBebidaActivityBebidas)
        val nomeDefault: TextView = findViewById(R.id.nomeDaBebidaActivityBebidas)
        val resumoDefault: TextView = findViewById(R.id.resumoBebidaActivityBebidas)

        imgDefault.setImageResource(imgIntent)
        nomeDefault.text = nomeIntent.toString()
        resumoDefault.text = resumoIntent.toString()
    }
}