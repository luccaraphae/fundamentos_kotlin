package one.digitalinnovation.collections.classes

data class Funcionario(
    val nome:String,
    val idade:Int,
    val telefone:String,
    val salario:Double
) {
    //subescreve a função toString para apresentar os dados de forma concatenada
    override fun toString(): String =
        """
            Nome:     $nome
            Idade:    $idade
            Telefone: $telefone
            Salário:  $salario
        """.trimIndent()
}


