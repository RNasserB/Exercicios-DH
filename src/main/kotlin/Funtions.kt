fun main (){
    print(maiorAb(5, 3, 5, 1))
}

fun soma(numeroUm: Int, numeroDois: Int): Int {
    return numeroUm + numeroDois
}

fun maiorNumero(numeroUm: Int, numeroDois: Int, numeroTres: Int): Int {
    if ((numeroUm >= numeroDois) and (numeroUm >= numeroTres)){
        return numeroUm
    } else if (numeroDois >= numeroTres){
        return numeroDois
    } else return numeroTres
}

fun textosDiferentes(textoUm: String, textoDois: String): Boolean {
    return textoUm != textoDois
}

fun numPar(numero: Int): Boolean {
    return (numero % 2) == 0
}

fun numImpares() {
    loop@ for (i in 1..100){
        if(i % 2 == 1){
            println(i)
        }
    }
}

fun maiorAb(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return ((numA > numC) and (numA > numD)) || ((numB > numC) and (numB > numD))
}