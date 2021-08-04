package classes

fun main(){

    var seuJorge = Aposentadoria(70, "Masculino", 60)
    println(seuJorge.podeAposentar())

    var produtoNotas = Produto(listOf(5,10,7))
    println(produtoNotas.produtoFinal())
}