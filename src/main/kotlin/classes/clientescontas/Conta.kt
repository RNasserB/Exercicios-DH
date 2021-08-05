package classes.clientescontas

class Conta(val numConta: Int, var saldo: Int, titular: Cliente) {

    fun deposito(valor: Int) {
        saldo += valor
        return println("Depósito efetuado, Saldo atual: $saldo")
    }

    fun saque(valor: Int) {
        if (valor <= saldo){
            saldo -= valor
           println("Transação realizada!, Saldo atual: $saldo")
        } else if(valor > saldo){
           println("Saldo insuficiente")
        }
    }

}