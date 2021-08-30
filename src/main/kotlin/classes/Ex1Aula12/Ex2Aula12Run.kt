package classes.Ex1Aula12

fun main() {

    var coca1 = Coca(1, 9.0)
    var coca2 = Coca(1,10.0)

    println (coca1 == coca2) // false depois true
    println(coca2)
    println(coca2.hashCode())
}