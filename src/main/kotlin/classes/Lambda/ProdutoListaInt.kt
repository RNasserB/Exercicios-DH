package classes.Lambda

fun main(){
    val produto = {numeros: List<Int> -> numeros.reduce { acc, i -> acc * i }}

    println(produto(arrayListOf(2, 4, 6)))
    println(produto(arrayListOf(10, 4, 10, 2, 10)))
}