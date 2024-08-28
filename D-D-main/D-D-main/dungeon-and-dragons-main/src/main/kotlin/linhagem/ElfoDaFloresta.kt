package linhagem

import Personagem

class ElfoDaFloresta : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.sabedoria += 1
    }

    override fun nomeRaca(): String {
        return "Elfo da Floresta"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 SAB"
    }

    fun historia(): String {
        return "Os Elfos da Floresta são conhecidos por sua profunda conexão com a natureza.\n " +
                "Vivendo entre as árvores antigas, " +
                "eles possuem uma compreensão única das forças naturais e dos segredos da floresta. \n" +
                "Seus sentidos aguçados e habilidades de sobrevivência os tornam guardiões vigilantes de seus lares arborizados,\n " +
                "sempre prontos para proteger o equilíbrio natural."
    }
}
