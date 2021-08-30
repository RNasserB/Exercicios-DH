package classes.Collections.SaveTheRoupa

fun main() {
    val blusaRicardo = Blusa("Nike", "Corta Vento")
    val calcaRicardo = Calca("Puma", "Moletom")

    val blusaArthur = Blusa("Adidas", "Capuz")
    val calcaArthur = Calca("Umbro", "Jeans")

    val guardaVolumes = GuardaVolumes()
    println(guardaVolumes.guardarPecas(mutableListOf(blusaRicardo, calcaRicardo)))
    println(guardaVolumes.guardarPecas(mutableListOf(blusaArthur, calcaArthur)))
    println(guardaVolumes.guardarPecas(mutableListOf(blusaRicardo, calcaArthur)))

    println("Peças armazenadas no Guarda-Volumes:")
    guardaVolumes.mostrarPecas()

    println("\n-----------------------")
    println("Impressão de um item específico:")
    guardaVolumes.mostrarPecas(2)

    guardaVolumes.removerPecas(3)

    println("\n-----------------------")
    println("Peças armazenadas no Guarda-Volumes:")
    guardaVolumes.mostrarPecas()

}