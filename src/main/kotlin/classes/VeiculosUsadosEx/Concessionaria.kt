package classes.VeiculosUsadosEx

class Concessionaria() {

    fun registrarVenda(cliente: Cliente, veiculo: Veiculo, valorVenda: Double) {
        var vendas = ArrayList<Any>()
        vendas.add(cliente)
        vendas.add(veiculo)
        vendas.add(valorVenda)
        println("Venda registrada: $vendas")
    }


}