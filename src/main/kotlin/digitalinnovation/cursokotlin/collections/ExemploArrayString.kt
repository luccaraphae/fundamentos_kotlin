package one.digitalinnovation.collections

fun main(){
    val nome = Array(4){""}
    nome[0]= "Lúcia"
    nome[1]= "Natanael"
    nome[2]= "Adailson"
    nome[3]= "Jurema"

    //Uma das formas de iterar o valor em uma variável
    for (nomes in nome){
        println(nomes)
    }
    println("_________________________________")


    //Neste caso os valores são atribuídos á variável através de seus índices
    for (index in nome.indices){
        println(nome[index])
    }
    println("_________________________________")


    //SORT: ordena os valores recebidos por default de forma crescente
    nome.sort()
    nome.forEach {
        println(it)
    }
    println("_________________________________")

    //ArrayOf
    val name= arrayOf("Lucas","Daniel","Laísa","Juliette","Celine")
    name.sort()
    name.forEach {
        println(it)
    }
}

