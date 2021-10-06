package digitalinnovation.cursokotlin.collections.classes.testesLogicos

fun main() {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val renda = readLine()!!.toFloat()
    var imposto = 0F
    val dif: Float


    when {
        //Cota acima de 4500 = 28%
        renda > 4500 -> {
            imposto = ((1000 / 100 * 8) + (1500 / 100 * 18).toFloat())
            dif = renda - 4500
            imposto += (dif / 100 * 28)
)
        }
        //Cota acima de 3000 até 4500 = 18%
        renda > 3000 -> {
            imposto = 1000 / 100 * 8.toFloat()
            dif = renda - 3000
            imposto += (dif / 100 * 18)
        }
        //Cota acima de 2000 até 3000 = 8%
        renda > 2000 -> {
            dif = renda - 2000
            imposto = dif / 100 * 8
        }
    }

    if (imposto == 0F) println("Isento") else println("R$ ${imposto.format(2)}")
}