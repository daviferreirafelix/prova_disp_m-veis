package com.br.ifgoiano.cafeteriaseumadruga.data

data class Servicos(val nomeServico: String){
    object ServicosData {
        fun getServicos(): List<Servicos>{
            return listOf(Servicos("Bebidas"),
                          Servicos("Comida"),
                          Servicos("Mercearia"))
        }
    }
}
