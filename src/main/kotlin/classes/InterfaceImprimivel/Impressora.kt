package classes.InterfaceImprimivel

class Impressora() {

    val listaImprimivel = mutableListOf<Imprimivel>()

    fun pegarEAdicionar(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimirTudo() {
        for (i in listaImprimivel.indices) {
            listaImprimivel[i].imprimir()
        }
    }

    fun deletarFilaImpressao() {
        listaImprimivel.clear()
        println("Lista de Impressão deletada")
    }

}