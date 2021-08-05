package classes.clientescontas

fun main(){
    var cliente1 = Cliente("Ricardo","Nasser")
    var cliente2 = Cliente("Arthur", "Benck")

    var contaRicardo = Conta(12345, 500, cliente1)
    var contaArthur = Conta(56789, 500, cliente2)

    contaRicardo.deposito(300)
    contaRicardo.saque(200)

    contaArthur.deposito(400)
    contaArthur.saque(600)



}