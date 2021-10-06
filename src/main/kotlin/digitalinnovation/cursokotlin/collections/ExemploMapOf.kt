package one.digitalinnovation.collections

fun main() {
    //Função Pair cria uma collection com uma Key e um Value e a função MapOf cria uma lista dessas chaves e valores
    val pair: Pair<String,Int> = Pair("Jerry",30)
    val result = mapOf(pair)

    result.forEach { (k, v) -> println("Nome: $k - Idade: $v")  }
    println("-------------------------------------------------")

    //Forma de fazer um MapOf mais simplificado
    val result2 = mapOf(
        "Emanuel" to 27,
        "Luiza" to 23,
        "Catarina" to 32
    )

    result2.forEach { (n, i) -> println("Nome: $n - Idade: $i") }
}