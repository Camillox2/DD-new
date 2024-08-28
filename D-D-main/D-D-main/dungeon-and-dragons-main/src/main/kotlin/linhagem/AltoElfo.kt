package linhagem

import Personagem

class AltoElfo : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.inteligencia += 1
    }

    override fun nomeRaca(): String {
        return "Alto Elfo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 INT"
    }

    fun historia(): String {
        return "Os Altos Elfos são conhecidos por sua graça e inteligência. \n" +
                " Habitantes das torres de marfim, eles se dedicam a estudar as artes arcanas,\n" +
                " sempre buscando novos conhecimentos e aprimoramentos. \n" +
                "A presença de um Alto Elfo é um símbolo de sabedoria e poder,\n" +
                "suas decisões são sempre ponderadas e calculadas."
    }
}
