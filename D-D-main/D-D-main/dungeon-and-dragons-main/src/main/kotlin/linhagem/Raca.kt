package linhagem
import Personagem

interface Raca {

    fun bonusRaca(personagem: Personagem)
    fun nomeRaca(): String
    fun exibirBonus(): String

}