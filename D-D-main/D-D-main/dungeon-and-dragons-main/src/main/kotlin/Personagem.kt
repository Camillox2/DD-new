import linhagem.Raca

class Personagem (

    var nome: String = "",
    val atributos: Atributos,
    var raca: Raca? = null


) {

    fun exibirTabelaAtributos() {
        atributos.calcularVida()
        println("\n")
        println("+------------------------------+")
        println("|         PERSONAGEM           |")
        println("+------------------------------+")
        println("| NOME: ${nome.padEnd(22)} |")
        println("| RAÇA: ${raca?.nomeRaca()?.padEnd(22)} |")
        println("+------------------------------+")
        println("| ATRIBUTOS                    |")
        println("+------------------------------+")
        println("| INTELIGÊNCIA: ${atributos.inteligencia.toString().padStart(2)}             |")
        println("| SABEDORIA:    ${atributos.sabedoria.toString().padStart(2)}             |")
        println("| CARISMA:      ${atributos.carisma.toString().padStart(2)}             |")
        println("| CONSTITUIÇÃO: ${atributos.constituicao.toString().padStart(2)}             |")
        println("| DESTREZA:     ${atributos.destreza.toString().padStart(2)}             |")
        println("| FORÇA:        ${atributos.forca.toString().padStart(2)}             |")
        println("+------------------------------+")
        println("| VIDA: ${atributos.vida.toString().padEnd(22)} |")
        println("+------------------------------+")
    }


    fun aplicarBonusRaca(){
        raca?.bonusRaca(this)
    }

}