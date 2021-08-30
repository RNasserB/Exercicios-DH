package classes.Collections.SaveTheRoupa

abstract class Peca(var marca: String, var modelo: String) {

    abstract fun retirada()

    override fun toString(): String {
        return "Marca: $marca. Modelo: $modelo"
    }

}