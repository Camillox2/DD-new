package linhagem

import Personagem

class Humano : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Humano"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 em todos os atributos"
    }

    fun historia(): String {
        return "Os Humanos são a raça mais adaptável e versátil do mundo.\n" +
                " Eles prosperam em quase todos os ambientes e são conhecidos por sua capacidade de se\n" +
                " ajustar a novas situações com rapidez. Sua diversidade cultural e \n" +
                "ambição fazem deles líderes naturais e exploradores incansáveis."
    }
}
