package com.br.ifgoiano.cafeteriaseumadruga

import CafeAdapter
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.br.ifgoiano.cafeteriaseumadruga.activities.Activity2
import com.br.ifgoiano.cafeteriaseumadruga.adapter.BebidasAdapterRecyclerView
import com.br.ifgoiano.cafeteriaseumadruga.data.Servicos

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listView: ListView = findViewById(R.id.listView)
        val servicos = Servicos.ServicosData.getServicos()

        listView.adapter = CafeAdapter(this, servicos)
        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, idx: Int, id: Long) {
        val servico = parent?.getItemAtPosition(idx) as Servicos

        if (servico.nomeServico != "Bebidas")
            Toast.makeText(this,"Serviço não disponível.", Toast.LENGTH_SHORT).show()

        else {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}