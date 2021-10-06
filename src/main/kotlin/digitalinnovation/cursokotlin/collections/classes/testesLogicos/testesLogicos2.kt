package digitalinnovation.cursokotlin.collections.classes.testesLogicos

fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }

        if(input.size == 2){
            val valorMdc = mdc(input[0], input[1])
            lista.add(valorMdc)
        }
    }

    for (i in lista){
        println(i)
    }
}


// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    if(n2 == 0){
        return n1;
    }else{
        return mdc(n2, n1%n2);
    }
}

