package linhagem

import Personagem

class Gnomo : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.inteligencia += 1
    }

    override fun nomeRaca(): String {
        return "Gnomo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 INT"
    }

    fun historia(): String {
        return "Os Gnomos são criaturas pequenas, mas dotadas de grande inteligência e curiosidade.\n " +
                "Vivem em comunidades secretas nas florestas e montanhas, onde dedicam suas vidas a invenções e descobertas.\n" +
                " Um Gnomo é sempre bem-vindo por aqueles que precisam de uma solução criativa para um problema complicado.\n"
    }
}
