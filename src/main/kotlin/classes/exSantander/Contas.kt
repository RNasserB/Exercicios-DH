package classes.exSantander

open class Contas(var saldo: Double, cliente: Clientes) {

    open fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
            return println("Depósito efetuado, Saldo atual: $saldo")
        } else
            erroTransacao()
            return println("Valor não disponível para essa operação")
    }

    open fun saque(valor: Double) {
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

    open fun consultarSaldo() {
        return println("Saldo: R$ $saldo")
    }

    fun erroTransacao(){
        println("Operação não efetuada")
    }

    open fun depositar(valor: Double) {}
}