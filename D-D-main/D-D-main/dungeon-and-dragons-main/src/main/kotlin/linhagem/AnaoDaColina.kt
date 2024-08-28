package linhagem

import Personagem

class AnaoDaColina : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 1
        personagem.atributos.sabedoria += 1
    }

    override fun nomeRaca(): String {
        return "Anão da Colina"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 CON\n" +
                "    +1 SAB"
    }

    fun historia(): String {
        return "Os Anões da Colina são conhecidos por sua sabedoria ancestral e profundo conhecimento da terra.\n" +
                " Vivem em comunidades isoladas nas colinas,\n" +
                " onde cultivam o solo e protegem suas moradas com grande zelo.\n " +
                "Sua conexão com a natureza é profunda, e eles acreditam que a terra é sagrada."
    }
}
