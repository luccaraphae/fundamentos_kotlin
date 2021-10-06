package digitalinnovation.cursokotlin.collections

import digitalinnovation.cursokotlin.collections.classes.Funcionario
import digitalinnovation.cursokotlin.collections.classes.General

fun main() {
    //criando variáveis dos funcionários e adicionadno seus atributos
    val lucas= Funcionario("Lucas de Amourim", 21, "(00) 0000-0000", 2700.05,"CLT")
    val jales= Funcionario("Jales Souza",30, "(11) 1111-1111",1361.00,"PJ")
    val ana= Funcionario("Ana Beatriz Gonçalves", 25,"(22) 2222-2222", 2998.21,"CLT")
    val luiza= Funcionario("Luiza Malheiros Oliveira",41,"(33) 3333-3333",2543.98,"PJ")

    val dados = General<Funcionario>()

    dados.create(lucas.nome, lucas)
    
}