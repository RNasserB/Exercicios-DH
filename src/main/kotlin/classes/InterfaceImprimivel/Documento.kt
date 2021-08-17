package classes.InterfaceImprimivel

class Documento(override val tipoDocumento: String, override val nome: String):Imprimivel {

    override fun imprimir() {
        println("Eu sou um $tipoDocumento, $nome")
    }
}