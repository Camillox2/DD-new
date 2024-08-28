import kotlin.random.Random

class Batalha(val personagem1: Personagem, val personagem2: Personagem) {

    fun iniciarBatalha() {
        println("\nA batalha entre ${personagem1.nome} e ${personagem2.nome} começou!\n")
        var turno = 1

        while (personagem1.atributos.vida > 0 && personagem2.atributos.vida > 0) {
            println("\n--- Turno $turno ---")
            realizarAtaque(personagem1, personagem2)
            if (personagem2.atributos.vida <= 0) {
                println("\n${personagem2.nome} foi derrotado!")
                break
            }
            realizarAtaque(personagem2, personagem1)
            if (personagem1.atributos.vida <= 0) {
                println("\n${personagem1.nome} foi derrotado!")
                break
            }
            turno++
        }

        println("\nBatalha encerrada!")
    }

    private fun realizarAtaque(atacante: Personagem, defensor: Personagem) {
        val dano = calcularDano(atacante)
        defensor.atributos.vida -= dano

        println("${atacante.nome} ataca ${defensor.nome} e causa $dano de dano.")
        println("${defensor.nome} tem ${defensor.atributos.vida} de vida restante.")
    }

    private fun calcularDano(atacante: Personagem): Int {
        // O dano pode ser baseado na força do atacante com um fator aleatório
        val fatorAleatorio = Random.nextInt(1, 6)
        return atacante.atributos.forca + fatorAleatorio
    }
}
