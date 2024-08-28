package linhagem

import Personagem

class Halfling : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.destreza += 2
    }

    override fun nomeRaca(): String {
        return "Halfling"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 DES"
    }

    fun historia(): String {
        return "Os Halflings são pequenos em estatura, mas grandes em espírito.\n" +
                " Conhecidos por sua alegria e bravura, eles preferem viver em comunidades pacíficas, \n" +
                "mas não hesitam em se aventurar quando a situação exige.\n " +
                "Sua agilidade e sorte natural os tornam adversários difíceis de capturar."
    }
}
