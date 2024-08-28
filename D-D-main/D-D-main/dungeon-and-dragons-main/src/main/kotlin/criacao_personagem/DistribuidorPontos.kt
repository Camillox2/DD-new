package criacao_personagem

import Atributos
import java.util.Scanner

class DistribuidorPontos {

    fun exibirTabelaCustoPontos() {
        println("\n")
        println("+-------------------+")
        println("| Valor | Custo     |")
        println("+-------------------+")
        println("|   8   |  0 pontos |")
        println("|   9   |  1 ponto  |")
        println("|  10   |  2 pontos |")
        println("|  11   |  3 pontos |")
        println("|  12   |  4 pontos |")
        println("|  13   |  5 pontos |")
        println("|  14   |  7 pontos |")
        println("|  15   |  9 pontos |")
        println("+-------------------+")
    }

    fun distribuidorPadrao(atributos: Atributos): Boolean {

        val custoPontos = mapOf(
            8 to 0,
            9 to 1,
            10 to 2,
            11 to 3,
            12 to 4,
            13 to 5,
            14 to 7,
            15 to 9
        )

        var pontosRestantes: Int = 27
        val scanner = Scanner(System.`in`)

        while (pontosRestantes > 0) {
            println(
                "\nVocê possui $pontosRestantes pontos para distribuir.\n" +
                        "Deseja gastar seus pontos? (S/N)"
            )

            val resposta = readLine()?.lowercase()

            if (resposta == "n") {
                return false
            }

            val mapeamentoAtributos = mapOf(
                1 to "FORÇA",
                2 to "DESTREZA",
                3 to "CONSTITUIÇÃO",
                4 to "INTELIGÊNCIA",
                5 to "SABEDORIA",
                6 to "CARISMA"
            )

            println("Escolha um atributo para distribuir seus pontos.")
            println("1. Força (atual: ${atributos.forca})")
            println("2. Destreza (atual: ${atributos.destreza})")
            println("3. Constituição (atual: ${atributos.constituicao})")
            println("4. Inteligência (atual: ${atributos.inteligencia})")
            println("5. Sabedoria (atual: ${atributos.sabedoria})")
            println("6. Carisma (atual: ${atributos.carisma})")

            val escolha = scanner.nextInt()
            val atributoEscolhido = mapeamentoAtributos[escolha]

            val atributoAtual = when (escolha) {
                1 -> atributos.forca
                2 -> atributos.destreza
                3 -> atributos.constituicao
                4 -> atributos.inteligencia
                5 -> atributos.sabedoria
                6 -> atributos.carisma
                else -> 8
            }

            if (escolha in 1..6) {
                exibirTabelaCustoPontos()
                println("Qual valor você deseja para $atributoEscolhido?")

                val pontos = scanner.nextInt()

                if (pontos !in 8..15) {
                    println("Valor inválido. Escolha um valor entre 8 e 15.")
                    continue
                }

                if (pontos <= atributoAtual) {
                    println("Você já está neste nível ou acima.")
                    continue
                }

                if (atributoAtual != 8) {
                    println("Você já alterou esse atributo.")
                    continue
                }

                val custo = custoPontos[pontos] ?: 0

                if (custo > pontosRestantes) {
                    println("Você não tem pontos suficientes para aumentar $atributoEscolhido para $pontos.")
                    continue
                }

                when (escolha) {
                    1 -> atributos.forca = pontos
                    2 -> atributos.destreza = pontos
                    3 -> atributos.constituicao = pontos
                    4 -> atributos.inteligencia = pontos
                    5 -> atributos.sabedoria = pontos
                    6 -> atributos.carisma = pontos
                }

                pontosRestantes -= custo

                println("$atributoEscolhido agora é $pontos. Você ainda possui $pontosRestantes pontos para distribuir.")
            } else {
                println("Escolha inválida.")
            }
        }

        // Prompt the user if they want to reset and redistribute points
        println("\nDeseja redefinir e redistribuir os pontos? (S/N)")
        val redefinir = scanner.next().lowercase()

        if (redefinir == "s") {
            atributos.resetarAtributos()
            return true  // Return true to indicate that the points should be redistributed
        }

        return false  // Return false to indicate that the points were not reset
    }
}
