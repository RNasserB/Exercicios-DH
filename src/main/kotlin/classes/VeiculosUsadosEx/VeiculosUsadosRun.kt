package classes.VeiculosUsadosEx

fun main(){

    val clienteRicardo = Cliente("Ricardo", "Nasser", "9898-9898")
    val veiculoFox = Veiculo("Volks", "Fox", 2005, "Prata", 135000)
    val vendaUm = Venda(clienteRicardo, veiculoFox, 12000.00)

    Concessionaria().registrarVenda(clienteRicardo, veiculoFox, 12000.00)


}