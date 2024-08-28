package criacao_personagem

import linhagem.*
import java.util.Scanner

class SeletorRaca {

    fun selecionarRaca(): Raca {
        val scanner = Scanner(System.`in`)
        val racas = listOf(
            Humano(), AltoElfo(), Elfo(), ElfoDaFloresta(), Drow(),
            Anao(), AnaoDaColina(), AnaoDaMontanha(),
            Dragao(), Gnomo(), GnomoDasFlorestas(), GnomoDasRochas(),
            Halfling(), HalflingPesLeves(), HalflingRobusto(),
            MeioElfo(), MeioOrc(), Tiefling()
        )

        while (true) {
            /* LISTA DE RAÇAS */
            for ((i, raca) in racas.withIndex()) {
                println("${i + 1}. ${raca.nomeRaca()}")
            }

            /* PERGUNTA UM NÚMERO BASEADO NA LISTA */
            println("\nEscolha a raça desejada: ")
            val escolha = scanner.nextInt()

            /* Esse scanner é necessário devido a um problema do Kotlin e Java,
            *  que deixa um /n após o nextInt, então precisamos usar esse nextLine
            *  para limpar o código e evitar que esse caractére seja detectado no
            *  próximo nextLine */
            scanner.nextLine()

            /* VERIFICA SE O NÚMERO ESTÁ NOS PADRÕES DA LISTA
            *  E RETORNA A RAÇA RELACIONADA AO NÚMERO.  */
            if (escolha in 1..racas.size) {
                val racaSelecionada = racas[escolha - 1]
                println(
                    "\nDeseja escolher a raça ${racaSelecionada.nomeRaca().lowercase()}? (S/N) \n" +
                            racaSelecionada.exibirBonus()
                )
                val resposta = scanner.nextLine().lowercase()

                /* PERGUNTA SE O USUÁRIO DESEJA PROSSEGUIR COM A RAÇA ESCOLHIDA */
                if (resposta == "s") {
                    /* Exibe a história da raça escolhida */
                    println("\nHistória da raça ${racaSelecionada.nomeRaca()}:")
                    val historia = when (racaSelecionada) {
                        is Humano -> racaSelecionada.historia()
                        is AltoElfo -> racaSelecionada.historia()
                        is Elfo -> racaSelecionada.historia()
                        is ElfoDaFloresta -> racaSelecionada.historia()
                        is Drow -> racaSelecionada.historia()
                        is Anao -> racaSelecionada.historia()
                        is AnaoDaColina -> racaSelecionada.historia()
                        is AnaoDaMontanha -> racaSelecionada.historia()
                        is Dragao -> racaSelecionada.historia()
                        is Gnomo -> racaSelecionada.historia()
                        is GnomoDasFlorestas -> racaSelecionada.historia()
                        is GnomoDasRochas -> racaSelecionada.historia()
                        is Halfling -> racaSelecionada.historia()
                        is HalflingPesLeves -> racaSelecionada.historia()
                        is HalflingRobusto -> racaSelecionada.historia()
                        is MeioElfo -> racaSelecionada.historia()
                        is MeioOrc -> racaSelecionada.historia()
                        is Tiefling -> racaSelecionada.historia()
                        else -> "História não disponível."
                    }
                    println(historia)
                    return racaSelecionada
                } else {
                    println("\n")
                }
            } else {
                println("Escolha inválida.")
            }
        }
    }
}
