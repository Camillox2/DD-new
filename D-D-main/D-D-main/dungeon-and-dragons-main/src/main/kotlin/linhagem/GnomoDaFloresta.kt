package linhagem

import Personagem

class GnomoDasFlorestas : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.destreza += 1
    }

    override fun nomeRaca(): String {
        return "Gnomo das Florestas"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 DES"
    }

    fun historia(): String {
        return "Os Gnomos das Florestas são conhecidos por sua habilidade em se misturar com a natureza.\n " +
                "Vivendo nas profundezas das florestas, eles são mestres da camuflagem e da sobrevivência.\n" +
                " Raramente vistos por estranhos, eles são protetores ferozes de suas terras e amigos fiéis dos animais."
    }
}
