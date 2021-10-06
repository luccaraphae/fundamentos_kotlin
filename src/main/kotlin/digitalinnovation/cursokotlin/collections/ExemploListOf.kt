package digitalinnovation.cursokotlin.collections

import digitalinnovation.cursokotlin.collections.classes.Funcionario

fun main(){
    //criando variáveis dos funcionários e adicionadno seus atributos
    val lucas= Funcionario("Lucas de Amourim", 21, "(00) 0000-0000", 2700.05,"CLT")
    val jales= Funcionario("Jales Souza",30, "(11) 1111-1111",1361.00,"PJ")
    val ana= Funcionario("Ana Beatriz Gonçaves", 25,"(22) 2222-2222", 2998.21,"CLT")
    val luiza= Funcionario("Luiza Malheiros Oliveira",41,"(33) 3333-3333",2543.98,"PJ")

    //Gera uma lista com as variáveis relacionadas
    val funcionarios= listOf(lucas,jales,ana,luiza)

    funcionarios.forEach { println(it)}

    println("_________________________________")

    //Procura um funcionário na condição estabelecida e se verdadeiro apresenta os dados, se falso retorna null
    println(funcionarios.find{ it.nome == "Lucas de Amourim" })

    println("_________________________________")

    //Imprime os resultados organizados de forma crescente pelo atributo salário
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("_________________________________")

    //Imprime os resultados organizados de forma agrupada pelo atributo tipocontratacao
    funcionarios.groupBy{ it.tipoContratacao }.forEach { println(it) }
}