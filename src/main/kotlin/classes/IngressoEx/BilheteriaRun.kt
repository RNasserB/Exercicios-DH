package classes.IngressoEx

import java.util.*

fun main() {
    bilheteria()

}

fun bilheteria() {
    val scanner = Scanner(System.`in`)
    println("Olá, qual ingresso gostaria de comprar?")
    println(
        """
        1 - Ingresso Padrão
        2 - Ingresso Vip
    """.trimIndent()
    )
    var retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        IngressoPadrao(10.0).imprimeValor()
    } else if (retornoInicial == 2) {
        IngressoVip(10.0).imprimeValor()
    } else {
        println("Opção inválida")
        return main()
    }
}