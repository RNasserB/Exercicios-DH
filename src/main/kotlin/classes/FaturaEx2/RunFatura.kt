package classes.FaturaEx2

fun main() {

    val itemComputador = Item(10, "Computador", 2, 5.0)
    val itemMonitor = Item(15, "Monitor", 3, 10.0)
    val itemTeclado = Item(15, "Monitor", -5, -5.0)

    val compraUm = Fatura(arrayListOf(itemComputador, itemMonitor, itemTeclado))

    println(compraUm.totalDaFatura())
}