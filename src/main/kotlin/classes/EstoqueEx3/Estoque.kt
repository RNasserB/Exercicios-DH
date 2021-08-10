package classes.EstoqueEx3

class Estoque(
    var nome: String,
    var qtdAtual: Int,
    var qtdMinima: Int
) {

    init {
        if (qtdAtual < 0){
            qtdAtual = 0
        }
        if (qtdMinima < 0){
            qtdMinima = 0
        }
    }

    fun mudarNome(nomeNovo: String) {
        nome = nomeNovo
        println("Nome alterado para $nome")
    }

    fun mudarQtdMinima(qtdMinimaNova: Int) {
        qtdMinima = qtdMinimaNova
        println("Quantidade mínima alterada para $qtdMinima")
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
        println("Repôs $qtd, quantidade atual: $qtdAtual")
    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd
        println("Baixa em $qtd itens, quantidade atual: $qtdAtual")
    }

    fun mostra(): String {
        return """
        Nome Produto: $nome
        Quantidade Mínima: $qtdMinima
        Quantidade Atual: $qtdAtual
    """.trimIndent()
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }

}