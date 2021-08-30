package classes.Lambda.Supermercado

fun main(){
    val produto1 = Produto("banana 0.6 kg", 6.90)
    val produto2 = Produto("pão de forma", 4.55)
    val produto3 = Produto("café 500g", 9.79)
    val produto4 = Produto("geleia", 15.64)

    val carrinhoDeCompras = CarrinhoDeCompras(mutableListOf(produto1, produto2, produto3, produto4))
    carrinhoDeCompras.incluirProduto(Produto("ovo 10 unidades", 10.25))

    val caixa = Caixa(carrinhoDeCompras)
    caixa.fechamentoDeConta(imprimeCabecalho=cabecalhoDoComprovante,
        incluiData=dataDaCompra, incluiListaCompras=imprimeListaDeCompra,
        calculaSomatorio=adicionaRodape)
}