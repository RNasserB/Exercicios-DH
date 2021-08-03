package classes

fun main(){

    var seuJorge = Aposentadoria(70, "Masculino", 60)
    println(seuJorge.podeAposentar())

    var produtoNotas = Produto()
    println(produtoNotas.produtoFinal(2,2,2))
}