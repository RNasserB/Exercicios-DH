package classes.clientescontas

fun main() {

    var cliente1 = Cliente(12345, "Ricardo", "Nasser", 123678, 4985324)
    var cliente2 = Cliente(12345, "Ricardo", "Nasser", 123478, 2985324)

    var contaRicardo = Conta(500.0, cliente1)
    var contaArthur = Conta(250.0, cliente2)



    contaRicardo.deposito(300.0)
    contaRicardo.saque(200.0)

    contaArthur.deposito(400.0)
    contaArthur.saque(600.0)

    contaArthur.consultarSaldo()


}