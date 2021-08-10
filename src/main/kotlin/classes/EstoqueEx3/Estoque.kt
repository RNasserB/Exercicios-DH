package classes.EstoqueEx3

class Estoque(val nome: String,
              var qtdAtual: Int,
              var qtdMinima: Int) {

    fun mudarNome(nome: String){
    var novoNome = ""
    }

    fun mudarQtdMinima(qtdMinima: Int){

    }

    fun repor(qtd: Int){
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int){
    qtdAtual -= qtd
    }

    fun mostra():String{
    return """
        Nome Produto: $nome
        Quantidade Mínima: $qtdMinima
        Quantidade Atual: $qtdAtual
    """.trimIndent()
    }

    fun precisaRepor() {
        qtdAtual <= qtdMinima
    }

}