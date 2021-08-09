package classes.clientescontas

fun main(){
    var cliente1 = Cliente(12345"Ricardo", "Nasser", 123456678, 214985324 )
    var cliente2 = Cliente(56789, "Arthur")

    var contaRicardo = Conta(500, cliente1)
    var contaArthur = Conta(500, cliente2)

    contaRicardo.deposito(300)
    contaRicardo.saque(200)

    contaArthur.deposito(400)
    contaArthur.saque(600)

    contaArthur.consultarSaldo()



}