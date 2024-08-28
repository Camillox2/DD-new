import linhagem.*

class Ataque(val nome: String, val danoMaximo: Int) {

    fun executar(): Int {
        return (1..danoMaximo).random() // Gera um dano aleatório entre 1 e o dano máximo
    }
}
