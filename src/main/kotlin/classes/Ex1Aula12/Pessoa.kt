package classes.Ex1Aula12

class Pessoa(val nome: String, val rg: Int) {

    override fun equals(other: Any?): Boolean {
        return (((other is Pessoa) && (other.rg == this.rg)))
    }

    override fun hashCode(): Int {
        return this.rg
    }

    override fun toString(): String {
        return "Nome: ${nome} e RG: ${rg}"
    }
}