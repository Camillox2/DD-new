package linhagem

import Personagem

class Dragao : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.forca += 2
    }

    override fun nomeRaca(): String {
        return "Dragão"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 FOR"
    }

    fun historia(): String {
        return "Os Dragões são criaturas majestosas e poderosas,\n " +
                "com uma história antiga que remonta aos primórdios do mundo.\n " +
                "Com sua força incomparável e capacidade de controlar o fogo, eles são temidos e reverenciados em igual medida.\n " +
                "Apenas os mais bravos se aproximam de um Dragão em busca de sabedoria ou tesouros."
    }
}
