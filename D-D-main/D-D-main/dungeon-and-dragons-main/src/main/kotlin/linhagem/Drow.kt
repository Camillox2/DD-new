package linhagem

import Personagem

class Drow : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.destreza += 2
    }

    override fun nomeRaca(): String {
        return "Drow"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 DES"
    }

    fun historia(): String {
        return "Os Drows, também conhecidos como Elfos Negros,\n" +
                " são mestres das sombras e da furtividade. Vivendo nas profundezas da terra, \n" +
                "eles são hábeis em emboscadas e ataques rápidos.\n " +
                "Embora temidos por muitos,\n" +
                " alguns Drows escolhem se afastar da escuridão de suas terras natais em \n" +
                "busca de redenção e um novo propósito."
    }
}
