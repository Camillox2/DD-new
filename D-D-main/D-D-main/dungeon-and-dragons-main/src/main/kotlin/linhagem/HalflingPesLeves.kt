package linhagem

import Personagem

class HalflingPesLeves : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.destreza += 2
        personagem.atributos.carisma += 1
    }

    override fun nomeRaca(): String {
        return "Halfling Pés Leves"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 DES\n" +
                "    +1 CAR"
    }

    fun historia(): String {
        return "Os Halflings Pés Leves são conhecidos por sua discrição e charme.\n" +
                "Eles têm a habilidade de passar despercebidos em quase qualquer lugar, \n" +
                "o que os torna excelentes espiões e diplomatas. Com sua natureza curiosa e\n" +
                " amigável, eles fazem amigos com facilidade onde quer que vão."
    }
}
