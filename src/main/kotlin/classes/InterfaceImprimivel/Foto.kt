package classes.InterfaceImprimivel

class Foto(override val tipoDocumento: String, override val nome: String) : Imprimivel {

    override fun imprimir() {
        println("Eu sou uma $tipoDocumento, $nome")
    }

}