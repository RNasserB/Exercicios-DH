package classes.InterfaceImprimivel

class Contrato(override val tipoDocumento: String, override val nome: String) : Imprimivel {

    override fun imprimir() {
        println("Eu sou um $tipoDocumento, $nome")
    }
}