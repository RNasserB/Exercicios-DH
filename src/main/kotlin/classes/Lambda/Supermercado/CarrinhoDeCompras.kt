package classes.Lambda.Supermercado

class CarrinhoDeCompras(var listaProdutos: MutableList<Produto>) {

    fun incluirProduto(produto: Produto){
        listaProdutos.add(produto)
    }
}