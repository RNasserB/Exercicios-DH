package classes.JogadoresTreinamento

fun main(){

    var jogador1 = JogadorDeFutebol("Ricardo", 40, 40, 5, 5)
    var jogador2 = JogadorDeFutebol("Arthur", 50, 50, 5, 8)

    var treinoRicardo = SessaoDeTreinamento(jogador1)
    var treinoArthur = SessaoDeTreinamento(jogador2)

    treinoRicardo.treinarA(jogador1)
    treinoArthur.treinarA(jogador2)
}