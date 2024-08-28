package linhagem

import Personagem

class AnaoDaMontanha : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.forca += 2
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Anão da Montanha"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 FOR\n" +
                "    +1 CON"
    }

    fun historia(): String {
        return "Os Anões da Montanha são conhecidos por sua incrível força e resistência.\n" +
                " Vivendo nas fortalezas esculpidas nas montanhas,\n " +
                "eles dedicam suas vidas à mineração e à arte da guerra.\n" +
                " Seus músculos são tão duros quanto a rocha que cavam, \n" +
                "e seus corações são firmes como o aço que forjam.\n"
    }
}
