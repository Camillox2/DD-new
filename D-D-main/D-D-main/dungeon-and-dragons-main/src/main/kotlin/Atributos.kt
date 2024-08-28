class Atributos {
    var inteligencia: Int = 8
    var sabedoria: Int = 8
    var carisma: Int = 8
    var constituicao: Int = 8
    var destreza: Int = 8
    var forca: Int = 8
    var vida: Int = 0
    private val modificador: Map<Int, Int> = mapOf(
        1 to -5,
        2 to -4,
        3 to -4,
        4 to -3,
        5 to -3,
        6 to -2,
        7 to -2,
        8 to -1,
        9 to -1,
        10 to 0,
        11 to 0,
        12 to 1,
        13 to 1,
        14 to 2,
        15 to 2,
        16 to 3,
        17 to 3,
        18 to 4,
        19 to 4,
        20 to 5
    )


    fun calcularVida() {
        vida = 30 + (modificador[constituicao] ?: 0)
    }

    fun resetarAtributos() {
        inteligencia = 8
        sabedoria = 8
        carisma = 8
        constituicao = 8
        destreza = 8
        forca = 8
    }
}
