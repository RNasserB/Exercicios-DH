package classes.clientescontas

class Conta(var saldo: Double, titular: Cliente) {

    fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
            return println("Depósito efetuado, Saldo atual: $saldo")
        } else
            erroTransacao()
            return println("Valor não disponível para essa operação")
    }

    fun saque(valor: Double) {
        if (valor <= saldo && valor > 0){
            saldo -= valor
           println("Saque realizado!, Saldo atual: $saldo")
        } else if(valor < 0){
            erroTransacao()
           println("Valor não disponível para essa operação")
        } else{
            erroTransacao()
            println("Saldo Insuficiente")
        }
    }

    fun consultarSaldo(): Double{
        return saldo
    }

    private fun erroTransacao(){
        println("Operação não efetuada")
    }

}