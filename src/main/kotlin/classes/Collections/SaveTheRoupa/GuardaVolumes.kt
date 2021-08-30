package classes.Collections.SaveTheRoupa

class GuardaVolumes() {

    var contador: Int = 0
    var dicionarioPecas: MutableMap<Int, MutableList<Peca>> = mutableMapOf()

    fun guardarPecas(pecas: MutableList<Peca>): Int {
        this.contador += 1
        val novaPeca = mapOf<Int, MutableList<Peca>>(Pair(this.contador, pecas))
        dicionarioPecas.putAll(novaPeca)
        return this.contador
    }

    fun mostrarPecas() {
        dicionarioPecas.forEach { println("Código: ${it.key} => Peças: ${it.value}") }
    }

    fun mostrarPecas(codigo: Int) {
        val peca = dicionarioPecas.filter { it.key == codigo }
        println(peca)
    }

    fun removerPecas(codigo: Int) {
        dicionarioPecas.remove(codigo)
    }
}