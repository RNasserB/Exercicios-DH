package classes.EstoqueEx3

fun main(){

    var produtoA = Estoque("Teclado", 5, 2)
    var produtoB = Estoque("Monitor", 2, 1)
    var produtoC = Estoque("Computador", -1, -2)

    println(produtoA.mostra())
    println(produtoA.mudarNome("Teclado MAX"))
    println(produtoA.mudarQtdMinima(3))
    println(produtoA.repor(3))
    println(produtoA.darBaixa(2))
    println(produtoA.precisaRepor())
    println(produtoA.mostra())

}