package classes.Lambda.Supermercado

import java.util.Calendar
import java.util.Calendar.*
import kotlin.math.nextUp

val cabecalhoDoComprovante: () -> Unit = { println("########## DH Super Market ##########") }

val dataDaCompra: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(DATE)}/${data.get(MONTH)+1}/${data.get(YEAR)}"
}

val imprimeListaDeCompra: (listaDeCompras: MutableList<Produto>) -> Unit = {
        lista -> lista.forEach{item -> println(item)}
}

val adicionaRodape: (listaDeCompras: MutableList<Produto>) -> Double = {
        lista -> lista.map { it.preco }.sum().nextUp()
}