import criacao_personagem.*
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println(
        "\n" +
                "--------------------------------------- \n" +
                "          Dungeons And Dragons       \n" +
                "---------------------------------------"
    )

    var resposta = ""
    var personagem1: Personagem

    do {
        println("\nComece sua história criando seu Personagem de D&D.\n" +
                "\nPrimeiramente, digite o NOME do seu personagem: ")

        val nomePersonagem1 = scanner.nextLine()
        personagem1 = Personagem(nomePersonagem1, Atributos())

        println("\nO nome do seu personagem é '$nomePersonagem1', Correto? (S/N)")
        resposta = scanner.nextLine().lowercase()
    } while (resposta != "s")

    val seletorRaca1 = SeletorRaca()
    personagem1.raca = seletorRaca1.selecionarRaca()

    var redistribuir1: Boolean
    do {
        val distribuicao1 = DistribuidorPontos()
        redistribuir1 = distribuicao1.distribuidorPadrao(personagem1.atributos)

        if (!redistribuir1) {
            personagem1.aplicarBonusRaca()
            personagem1.exibirTabelaAtributos()

            println("\nPersonagem criado com sucesso!")
        }
    } while (redistribuir1)

    println("\nAgora, vamos criar um oponente para seu personagem!")

    var personagem2: Personagem
    do {
        println("\nDigite o NOME do segundo personagem: ")

        val nomePersonagem2 = scanner.nextLine()
        personagem2 = Personagem(nomePersonagem2, Atributos())

        println("\nO nome do segundo personagem é '$nomePersonagem2', Correto? (S/N)")
        resposta = scanner.nextLine().lowercase()
    } while (resposta != "s")

    val seletorRaca2 = SeletorRaca()
    personagem2.raca = seletorRaca2.selecionarRaca()

    var redistribuir2: Boolean
    do {
        val distribuicao2 = DistribuidorPontos()
        redistribuir2 = distribuicao2.distribuidorPadrao(personagem2.atributos)

        if (!redistribuir2) {
            personagem2.aplicarBonusRaca()
            personagem2.exibirTabelaAtributos()

            println("\nOponente criado com sucesso!")
        }
    } while (redistribuir2)

    println("\nOs personagens estão prontos! Deseja iniciar a batalha entre ${personagem1.nome} e ${personagem2.nome}? (S/N)")
    resposta = scanner.nextLine().lowercase()

    if (resposta == "s") {
        val batalha = Batalha(personagem1, personagem2)
        batalha.iniciarBatalha()
    } else {
        println("\nBatalha cancelada. Fim do programa.")
    }
}
