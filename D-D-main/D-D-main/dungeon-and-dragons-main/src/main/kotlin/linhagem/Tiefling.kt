package linhagem

import Personagem

class Tiefling : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.carisma += 2
        personagem.atributos.inteligencia += 1
    }

    override fun nomeRaca(): String {
        return "Tiefling"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 CAR\n" +
                "    +1 INT"
    }

    fun historia(): String {
        return "Os Tieflings são descendentes de pactos antigos com seres infernais.\n" +
                " Marcados por suas aparências demoníacas,\n " +
                "como chifres e caudas, eles muitas vezes enfrentam desconfiança e medo das outras raças. \n" +
                "No entanto, eles possuem grande carisma e uma afinidade natural com magias sombrias,\n" +
                " o que os torna formidáveis feiticeiros e manipuladores.\n"
    }
}
