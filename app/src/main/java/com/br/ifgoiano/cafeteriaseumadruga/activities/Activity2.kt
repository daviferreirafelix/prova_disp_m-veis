package com.br.ifgoiano.cafeteriaseumadruga.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.ifgoiano.cafeteriaseumadruga.R
import com.br.ifgoiano.cafeteriaseumadruga.adapter.BebidasAdapterRecyclerView
import com.br.ifgoiano.cafeteriaseumadruga.data.Bebidas

class Activity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var bebidas: List<Bebidas> = emptyList()
    private lateinit var adapter: BebidasAdapterRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        bebidas = Bebidas.bebidasData.getBebidas()
        adapter = BebidasAdapterRecyclerView(this, bebidas, onCLickBebida())

        recyclerView.adapter = adapter
    }

    private fun onCLickBebida() : BebidasAdapterRecyclerView.BebidaOnCickListener {
        return object : BebidasAdapterRecyclerView.BebidaOnCickListener {
            override fun onCLickBebida(holder: BebidasAdapterRecyclerView.BebidaViewHoler?, idx: Int) {
                val bebida = bebidas.getOrNull(idx) ?: return

                val intent = Intent(baseContext, BebidasActivity::class.java)
                intent.putExtra("img", bebida.img)
                intent.putExtra("nome", bebida.nomeBebida)
                intent.putExtra("resumo", bebida.resumo)

                startActivity(intent)
            }
        }
    }
}