package one.digitalinnovation.collections

fun main(){

    val salario_base = doubleArrayOf(2300.00,1689.00,1095.00,971.22,3500.00)

    //Apresenta o maior valor do Array
    println("O maior salário é ${salario_base.maxOrNull()}")
    //Apresenta o menor valor do Array
    println("O menor salário é ${salario_base.minOrNull()}")
    //Apresenta a média de valores do Array
    println("A média salarial da empresa é ${salario_base.average()}")

    println("_________________________________")

    //Filtra em uma condição boleana se o valor é maior ou menor quê
    val maiorQue = salario_base.filter { it > 2000.00 }
    maiorQue.forEach {
        println(it)
    }
    println("_________________________________")

    //Conta os valores em uma range e imprime na tela
    println(salario_base.count {it in 2000.0..4000.0})
    //Procura um valor na condição estabelecida
    println(salario_base.find { it == 2000.0 })
    //Retorna um boleano na condição estabelecida
    println(salario_base.any { it > 900.00 })
}