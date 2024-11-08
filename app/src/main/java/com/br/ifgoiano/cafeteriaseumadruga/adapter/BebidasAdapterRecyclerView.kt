package com.br.ifgoiano.cafeteriaseumadruga.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.br.ifgoiano.cafeteriaseumadruga.R
import com.br.ifgoiano.cafeteriaseumadruga.data.Bebidas

class BebidasAdapterRecyclerView(private val context: Context, private val bebidas: List<Bebidas>,
                                 private val onClickListener: BebidaOnCickListener)
    : RecyclerView.Adapter<BebidasAdapterRecyclerView.BebidaViewHoler>() {

    interface BebidaOnCickListener {
        fun onCLickBebida(holder: BebidaViewHoler?, idx: Int)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BebidasAdapterRecyclerView.BebidaViewHoler {
        val view = LayoutInflater.from(context).inflate(R.layout.bebidas_adapter_recycler_view, viewGroup, false)
        return BebidaViewHoler(view)
    }

    override fun onBindViewHolder(
        holder: BebidasAdapterRecyclerView.BebidaViewHoler,
        position: Int
    ) {
        val bebida = bebidas[position]
        holder.nome.text = bebida.nomeBebida
        holder.resumo.text = bebida.resumo
        holder.img.setImageResource(bebida.img)
    }

    override fun getItemCount(): Int {
       return bebidas.size
    }

    class BebidaViewHoler(view: View) : RecyclerView.ViewHolder(view) {
        var nome: TextView = view.findViewById(R.id.nomeDaBebida)
        var img: ImageView = view.findViewById(R.id.fotoBebida)
        var resumo: TextView = view.findViewById(R.id.resumoBebida)
    }

}