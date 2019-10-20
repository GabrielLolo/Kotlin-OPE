package br.com.gabriellolo.carvalhoodonto

import android.content.Context

object OpcoesService {

    fun getOpcao(context: Context): List<Opcoes> {

        val opcoes = mutableListOf<Opcoes>()

        for (i in 1..5) {
            val d = Opcoes()
            d.nome = "Opção $i"
            d.foto =
                "https://www.sescsp.org.br/files/artigo/3b2d3910/857a/4170/84f2/39d28226978b.png"
            opcoes.add(d)
        }
        return opcoes
    }
}