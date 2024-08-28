package linhagem

import Personagem

class Anao : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Anão"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 CON"
    }

    fun historia(): String {
        return "Os Anões são uma raça robusta e resiliente,\n " +
                "habitantes das montanhas e profundezas. \n" +
                "Eles são mestres na arte da forja e conhecidos por sua lealdade inabalável.\n" +
                " Um Anão nunca abandona um amigo em necessidade e luta com a força de uma rocha."
    }
}
