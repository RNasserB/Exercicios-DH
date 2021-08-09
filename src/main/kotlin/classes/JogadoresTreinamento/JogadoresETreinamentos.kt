package classes.JogadoresTreinamento

fun main(){

    var jogador1 = JogadorDeFutebol("Ricardo", 40, 40, 5, 0)
    var jogador2 = JogadorDeFutebol("Arthur", 50, 50, 5, 8)

    var treinoRicardo = SessaoDeTreinamento(jogador1)
    var treinoArthur = SessaoDeTreinamento(jogador2)


    var contador = 1
    while (contador <= 3) {
        treinoRicardo.treinarA(jogador1)
        contador++
    }
    treinoArthur.treinarA(jogador2)
}