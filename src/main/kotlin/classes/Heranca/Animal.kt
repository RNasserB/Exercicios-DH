package classes.Heranca

open class Animal {
    var tamanho: Int = 0
    var cor: String = ""
    var peso: Double = 0.0

    open fun correr(){
        return println("Animal está correndo")
    }
}