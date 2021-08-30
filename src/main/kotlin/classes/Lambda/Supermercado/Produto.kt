package classes.Lambda.Supermercado

class Produto(var nome: String, var preco: Double){

    override fun toString(): String {
        return "$nome -> R$ $preco"
    }
}