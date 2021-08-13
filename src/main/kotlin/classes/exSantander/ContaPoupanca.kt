package classes.exSantander

class ContaPoupanca(
    saldo: Double,
    cliente: Clientes,
    var taxaJuros: Double
) : Contas(saldo, cliente) {

    init {
        if (taxaJuros < 0) {
            println("Taxa de Juros menor que 0")
            taxaJuros = 0.0
        }
    }

    fun recolherJuros() {
        saldo += (taxaJuros * 0.01) * saldo
        return println("Taxa de juros: $taxaJuros%, Saldo atualizado: $saldo")
    }

}