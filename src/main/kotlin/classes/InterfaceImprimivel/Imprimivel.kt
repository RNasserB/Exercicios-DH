package classes.InterfaceImprimivel

interface Imprimivel {

    val tipoDocumento: String
    val nome: String

    fun imprimir(){
        println("Eu sou $tipoDocumento, $nome")
    }

}