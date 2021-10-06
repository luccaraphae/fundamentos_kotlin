package digitalinnovation.cursokotlin.collections

import java.math.BigDecimal

//Reduz a tudo que está na somatória e atribui ao valor
fun Array<BigDecimal>.somatoria() = this.reduce { acc, valor -> acc + valor }

//Se this >= 0 divide a somatória pela quatidade de valores
fun Array<BigDecimal>.media()=
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria()/this.size.toBigDecimal()