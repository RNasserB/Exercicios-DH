fun main (){
    print(textosDiferentes("Ricardo", "Ricardo"))
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