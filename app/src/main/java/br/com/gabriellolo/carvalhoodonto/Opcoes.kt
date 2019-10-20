package br.com.gabriellolo.carvalhoodonto

import java.io.Serializable

class Opcoes : Serializable {

    var id: Long = 0
    var nome = ""
    var foto = ""

    override fun toString(): String {
        return "Opções(nome='$nome')"
    }
}