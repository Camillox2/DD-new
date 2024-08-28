package linhagem

import Personagem

class HalflingRobusto : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 2
    }

    override fun nomeRaca(): String {
        return "Halfling Robusto"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 CON"
    }

    fun historia(): String {
        return "Os Halflings Robustos são conhecidos por sua resistência física e determinação.\n " +
                "Embora pequenos, eles são incrivelmente difíceis de derrubar e \n" +
                "têm uma força de vontade que rivaliza com as raças maiores.\n" +
                " Eles preferem a vida simples, mas quando ameaçados, mostram uma ferocidade inesperada."
    }
}
