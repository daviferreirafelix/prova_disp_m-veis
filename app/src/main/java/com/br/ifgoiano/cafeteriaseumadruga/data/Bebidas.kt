package com.br.ifgoiano.cafeteriaseumadruga.data

import com.br.ifgoiano.cafeteriaseumadruga.R

data class Bebidas(val img: Int, val nomeBebida: String, val resumo: String) {
    object bebidasData {
        fun getBebidas() : List<Bebidas> {
            return listOf(Bebidas(R.drawable.expresso,"Expresso", "Um café forte e concentrado feito ao forçar água quente através de café\n" +
                    "moído fino. Base de várias outras bebidas de café."),
                          Bebidas(R.drawable.cappucino, "Capuccino", "Combina espresso com partes iguais de leite vaporizado e espuma de\n" +
                                  "leite. Famoso pelo equilíbrio entre sabores ricos e textura cremosa."),
                          Bebidas(R.drawable.americano,"Americano", "Espresso diluído com água quente, resultando em um café mais suave e\n" +
                                  "menos intenso. Popular entre quem gosta de sabores menos\n" +
                                  "concentrados."),
                          Bebidas(R.drawable.mocha, "Mocha", "Mistura de espresso com leite vaporizado e uma dose de chocolate.\n" +
                                  "Geralmente coberto com chantilly e popular entre os amantes de\n" +
                                  "chocolate"),
                          Bebidas(R.drawable.macchiato, "Macchiato", "Espresso “manchado” com um pouco de espuma de leite, acentuando o\n" +
                                  "sabor forte do café com apenas um toque de suavidade"),
                          Bebidas(R.drawable.flatwhite,"Flat White", "Similar ao cappuccino, mas com menos espuma e uma proporção maior\n" +
                                  "de leite. De origem australiana, tem sabor intenso e textura sedosa."),
                          Bebidas(R.drawable.ristreto,"Ristretto", "Uma dose de espresso mais concentrada e curta, com sabor mais denso\n" +
                                  "e encorpado. Ideal para quem gosta de café intenso."),
                          Bebidas(R.drawable.affogato, "Affogato", "Uma sobremesa italiana que combina espresso quente sobre uma bola de\n" +
                                  "sorvete de baunilha. Uma deliciosa fusão de quente e frio."),
                          Bebidas(R.drawable.coldbrew,"Cold Brew", "Café preparado com infusão em água fria por 12-24 horas, resultando em\n" +
                                  "um sabor suave e menos ácido. Servido gelado."))
        }
    }
}