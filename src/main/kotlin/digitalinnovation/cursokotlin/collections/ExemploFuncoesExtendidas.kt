package one.digitalinnovation.collections

fun main(){
    val salarios= arrayOf(
        "3200".toBigDecimal(),
        "4000".toBigDecimal(),
        "1200".toBigDecimal())

    println(salarios.somatoria())
    println("----------------------")
    println(salarios.media())
}