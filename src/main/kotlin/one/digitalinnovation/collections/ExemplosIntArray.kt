package one.digitalinnovation.collections

fun main () {

    val values = IntArray(5)
    values[0] = 2
    values[1] = 9
    values[2] = 4
    values[3] = 5
    values[4] = 7

    //1ª forma de iterar o valor em uma variável
    for (valor in values) {
        println(valor)
    }
    println("_________________________________")

    //2ª forma de iterar o valor em uma variável
    //Neste caso é atribuido automáticamente os valores a uma variável genérica "it"
    values.forEach {
        println(it)
    }
    println("_________________________________")

    //3ª forma de iterar o valor em uma variável
    //Neste caso os valores são atribuídos á variável através de seus índices
    for(index in values.indices){
        println(values[index])
    }
    println("_________________________________")

    //4ª forma de iterar o valor em uma variável
    //SORT: ordena os valores recebidos por default de forma crescente
    values.sort()
    for (valor in values) {
        println(valor)
    }

}