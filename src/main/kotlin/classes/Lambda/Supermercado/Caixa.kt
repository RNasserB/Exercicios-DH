package classes.Lambda.Supermercado

class Caixa(carrinhoDeCompras: CarrinhoDeCompras) {
    private val lista = carrinhoDeCompras.listaProdutos

    fun fechamentoDeConta(imprimeCabecalho: () -> Unit,
                          incluiData: () -> String,
                          incluiListaCompras: (lista: MutableList<Produto>) -> Unit,
                          calculaSomatorio: (lista: MutableList<Produto>) -> Double)
    {
        imprimeCabecalho()
        println("Data: ${incluiData()}\n")
        println("Produtos:")
        incluiListaCompras(lista)
        println("=============================")
        println("Total: R$ ${calculaSomatorio(lista)}")
    }
}