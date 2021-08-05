package classes.AtletasEProva

fun main(){

    var atleta1 = Atleta("Ricardo", 10, 10)
    var atleta2 = Atleta("Arthur", 5, 5)

    var prova1 = Prova(2, 2)
    var prova2 = Prova(6, 5)
    var prova3 = Prova(5, 15)

    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta1))

    println(prova1.podeRealizar(atleta2))
    println(prova2.podeRealizar(atleta2))
    println(prova3.podeRealizar(atleta2))

}