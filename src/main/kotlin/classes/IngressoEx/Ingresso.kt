package classes.IngressoEx

abstract class Ingresso(var valor: Double) {

    open fun imprimeValor() {
        println("Valor do Ingresso R$ $valor")
    }
}