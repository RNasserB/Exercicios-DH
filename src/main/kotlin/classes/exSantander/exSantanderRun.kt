package classes.exSantander


fun main() {

    var clientes1 = Clientes(12345, "Ricardo", "1234566788", "214985598324")
    var clientes2 = Clientes(52088, "Arthur", "1265658205", "654892045887")

    var contaPoupancaRicardo = ContaPoupanca(200.0, clientes1, 5.5)
    var contaCorrenteRicardo = ContaCorrente(500.0, clientes1, 1000.0, 1000.0)

    var chequeUm = Cheque(200.0, "Santander", "13/08/2021")

    contaCorrenteRicardo.deposito(300.0)
    contaCorrenteRicardo.saque(200.0)
    contaCorrenteRicardo.consultarSaldo()
    contaPoupancaRicardo.recolherJuros()
    contaPoupancaRicardo.consultarSaldo()
    contaCorrenteRicardo.depositarCheque(chequeUm)
    contaCorrenteRicardo.consultarSaldo()
    contaCorrenteRicardo.saque(1000.0)
    contaCorrenteRicardo.deposito(300.00)


}