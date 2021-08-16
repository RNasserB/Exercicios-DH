package classes.TripeEx

class Tripe(
    var estaDobrado: Boolean,
    val alturaMinima: Int,
    val alturaMaxima: Int,
    var alturaAtual: Int
) {

    init {
        if (alturaAtual < alturaMinima || alturaAtual > alturaMaxima) {
            alturaAtual = alturaMinima
            println(
                """
                Altura atual menor que a mínima ou maior que a máxima, Altura atual será igual altura mínima
            """.trimIndent()
            )
        }
    }

    fun definirAltura(novaAltura: Int) {
        if (novaAltura >= alturaMinima && novaAltura <= alturaMaxima) {
            alturaAtual = novaAltura
            println("Altura atual $novaAltura")
        } else {
            println("Valor incorreto")
        }
    }

    fun dobrar(){
        estaDobrado = true
        println("Tripé está dobrado")
    }

    fun desdobrar(){
        estaDobrado = false
        println("Tripé está desdobrado")
    }

    fun guardar() {
        if (prontoParaGuardar()){
            println("Tripé está guardado")
        } else{
            println("Tripé não está pronto para ser guardado")
        }
    }

    fun prontoParaGuardar(): Boolean {
        if (alturaAtual == alturaMinima && estaDobrado){
            println("Tripé está pronto para ser guardado")
            return true
        } else{
            println("Tripé não está pronto para ser guardado")
            return false
        }
    }

    fun usar() {
        if (prontoParaUsar()){
            println("Tripé pode ser usado")
        } else{
            println("Tripé não pode ser usado")
        }
    }

    fun prontoParaUsar(): Boolean {
        if (alturaAtual >= (alturaMaxima/2) && !estaDobrado){
            println("Tripé está pronto para ser usado")
            return true
        } else{
            println("Tripé não está pronto para ser usado")
            return false
        }
    }

}