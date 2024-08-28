package linhagem

import Personagem

class MeioElfo : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.carisma += 2
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Meio-Elfo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 CAR\n" +
                "    +1 em outros atributos"
    }

    fun historia(): String {
        return "Os Meio-Elfos combinam as melhores características de seus antepassados humanos e élficos.\n" +
                " Eles são conhecidos por sua beleza e carisma, assim como pela sua adaptabilidade.\n" +
                " Frequentemente servindo como embaixadores ou diplomatas,\n" +
                "os Meio-Elfos são mestres na arte de unir culturas diferentes."
    }
}
