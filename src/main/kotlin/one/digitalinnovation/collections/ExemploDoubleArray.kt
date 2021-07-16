package one.digitalinnovation.collections

fun main(){
    val salario = DoubleArray(4)
    salario[0]= 1000.00
    salario[1]= 3000.00
    salario[2]= 7000.00
    salario[3]= 5000.00

    salario.sort()
    salario.forEach {
        println(it)
    }
    println("_________________________________")


    salario.forEachIndexed { index, salarios ->
        salario[index] = salarios * 1.3
    }
    salario.forEach {
        println(it)
    }
    println("_________________________________")


    val comissao = doubleArrayOf(1.0,2.3,1.7,3.0)
    comissao.sort()
    comissao.forEach {
        println(it)
    }
}