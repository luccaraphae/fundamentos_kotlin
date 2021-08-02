package one.digitalinnovation.collections

import one.digitalinnovation.collections.classes.Funcionario

fun main() {
    //criando variáveis dos funcionários e adicionadno seus atributos
    val lucas= Funcionario("Lucas de Amourim", 21, "(00) 0000-0000", 2700.05,"CLT")
    val jales= Funcionario("Jales Souza",30, "(11) 1111-1111",1361.00,"PJ")
    val ana= Funcionario("Ana Beatriz Gonçalves", 25,"(22) 2222-2222", 2998.21,"CLT")
    val luiza= Funcionario("Luiza Malheiros Oliveira",41,"(33) 3333-3333",2543.98,"PJ")

    val funcionarioMutable = mutableListOf(ana,jales,luiza)
    funcionarioMutable.forEach { println(it) }

    //Por ser mutable pode-se adicionar um dado mesmo após inicializado
    println("------------- ADD ----------------")
    funcionarioMutable.add(lucas)
    funcionarioMutable.forEach { println(it) }

    //Pode-se também remover um dado
    println("------------- REMOVE ----------------")
    funcionarioMutable.remove(jales)
    funcionarioMutable.forEach { println(it) }

}