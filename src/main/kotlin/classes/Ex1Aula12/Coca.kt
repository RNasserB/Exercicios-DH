package classes.Ex1Aula12

class Coca(var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?): Boolean {
        return ((other is Coca) && (other.tamanho == this.tamanho))
    }

    override fun hashCode(): Int {
        return this.tamanho
    }

    override fun toString(): String {
        return "Tamanho: ${tamanho} Preço: ${preco}"
    }

}