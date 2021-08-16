package classes.exSantander

class ContaCorrente(
    saldo: Double,
    cliente: Clientes,
    var chequeEspecial: Double,
    var limiteChequeEspecial: Double
) : Contas(saldo, cliente) {
    init {
        if (chequeEspecial < 0) {
            println("Cheque Especial menor que 0")
            chequeEspecial = 0.0
        }
        if (limiteChequeEspecial < 0) {
            println("Limite Cheque Especial menor que 0")
            limiteChequeEspecial = 0.0
        }
    }

    override fun saque(valor: Double) {
        if (valor <= 0.0) {
            println("Operação não realizada. Motivo: valor inválido")
        } else if (valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso. Saldo Disponível: R$ $saldo")
        } else if (valor <= saldo + chequeEspecial) {
            chequeEspecial -= (valor - saldo)
            saldo = 0.0
            println(
                "Saque realizado com sucesso. Saldo Disponível: " +
                        "R$ $saldo Limite Disponível: R$ $chequeEspecial"
            )
        } else {
            println("Operação não realizada. Motivo: limite insuficiente")
        }
    }

    fun depositarCheque(cheque: Cheque) {
        if (cheque.valor > 0) {
            saldo += cheque.valor
            return println("Depósito de Cheque efetuado, Saldo atual: $saldo")
        } else
            erroTransacao()
        return println("Valor não disponível para essa operação")
    }

    override fun deposito(valor: Double) {
        if (valor > 0 && chequeEspecial < limiteChequeEspecial) {
            chequeEspecial += valor
            if (chequeEspecial > limiteChequeEspecial) {
                var sobraChequeEspecial = (chequeEspecial - limiteChequeEspecial)
                chequeEspecial -= sobraChequeEspecial
                saldo += sobraChequeEspecial
            }
            println("Depósito efetuado")
            return consultarSaldo()
        }else if (valor > 0 && chequeEspecial == limiteChequeEspecial){
            saldo += valor
            println("Depósito efetuado")
            return consultarSaldo()
        } else
            erroTransacao()
        return println("Valor não disponível para essa operação")
    }

    override fun consultarSaldo() {
        return println("Saldo: R$ $saldo. Cheque Especial: R$ $chequeEspecial")
    }
}

