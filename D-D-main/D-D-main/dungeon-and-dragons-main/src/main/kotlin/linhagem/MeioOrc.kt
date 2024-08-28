package linhagem

import Personagem

class MeioOrc : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.forca += 2
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Meio-Orc"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 FOR\n" +
                "    +1 CON"
    }

    fun historia(): String {
        return "Os Meio-Orcs são o resultado da união entre humanos e orcs,\n " +
                "combinando a força bruta dos orcs com a inteligência dos humanos.\n" +
                " Eles são guerreiros formidáveis, muitas vezes enfrentando preconceito por suas origens,\n" +
                " mas provam seu valor em batalha e com uma lealdade inabalável."
    }
}
