package linhagem

import Personagem

class Elfo : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.destreza += 2
    }

    override fun nomeRaca(): String {
        return "Elfo"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +2 DES"
    }

    fun historia(): String {
        return "Os Elfos são conhecidos por sua elegância e agilidade.\n" +
                "Habitantes das florestas ancestrais, eles têm uma conexão profunda com a natureza e as artes.\n" +
                " Seus sentidos aguçados e sua longevidade os tornam vigilantes e sábios,\n" +
                " sempre prontos para defender suas terras e tradições."
    }
}
