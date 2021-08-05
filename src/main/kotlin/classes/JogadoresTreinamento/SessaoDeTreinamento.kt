package classes.JogadoresTreinamento

class SessaoDeTreinamento(jogadorDeFutebol: JogadorDeFutebol) {

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        var expInicial = jogadorDeFutebol.experiencia
        jogadorDeFutebol.experiencia += 1
        var expFinal = jogadorDeFutebol.experiencia
        println("Experiência Inicial: $expInicial e Experiência Final: $expFinal")
    }

}