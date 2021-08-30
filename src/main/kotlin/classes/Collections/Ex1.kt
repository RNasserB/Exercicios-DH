package classes.Collections

fun main() {

    println("EXERCÍCIO 1")

    val loteriaDosSonhosMap = mapOf<Int, String>(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    fun printarLista() {
        for (item in loteriaDosSonhosMap) {
            println("${item.key} ${item.value}")
        }
    }

    printarLista()

    println("EXERCÍCIO 2")

    var amigos1 = listOf("Juan", "El Divo", "Maromba", "Zé Bonitinho")
    var amigos2 = listOf("Dark Knight", "Bruce Wayne", "Batfeck", "Gengiva")
    var amigos3 = listOf("Ju", "Mary", "Marilene", "Ventania")
    var amigos4 = listOf("Lukinha", "Jorge", "George", "Kevin Flynn")

    var dicionarioDeApelidos = mapOf("João" to amigos1, "Miguel" to amigos2, "Maria" to amigos3, "Lucas" to amigos4)

    fun printarApelidos() {
        for ((nome, apelidos) in dicionarioDeApelidos) {
            println("Nome = $nome  Apelidos = $apelidos")
        }
    }

    printarApelidos()

    println("EXERCÍCIO 3")

    var listaNumeros = mutableListOf<Int>()
    listaNumeros.add(1)
    listaNumeros.add(5)
    listaNumeros.add(5)
    listaNumeros.add(6)
    listaNumeros.add(7)
    listaNumeros.add(8)
    listaNumeros.add(8)
    listaNumeros.add(8)

    println(listaNumeros)

    println("EXERCÍCIO 4")

    var listaNumerosConjunto = mutableSetOf<Int>()
    listaNumerosConjunto.add(1)
    listaNumerosConjunto.add(5)
    listaNumerosConjunto.add(5)
    listaNumerosConjunto.add(6)
    listaNumerosConjunto.add(7)
    listaNumerosConjunto.add(8)
    listaNumerosConjunto.add(8)
    listaNumerosConjunto.add(8)

    println(listaNumerosConjunto + " Ele não repetiu os números")

    println("EXERCÍCIO 5")

    fun somaTotal(listaNumerosSoma: Set<Int>) {
        var soma = 0
        for (item in listaNumerosSoma) {
            soma += item
        }
        println(soma)
    }

    somaTotal(setOf(1, 2, 2, 3, 5))


}