package classes.InterfaceImprimivel

fun main() {
    var fotoA = Foto("Foto", "Selfie")
    var documentoA = Documento("Documento", "RG")
    var contratoA = Contrato("Contrato", "Contrato de Trabalho")

    var impressora = Impressora()

    impressora.pegarEAdicionar(fotoA)
    impressora.pegarEAdicionar(documentoA)
    impressora.pegarEAdicionar(contratoA)
    impressora.imprimirTudo()
    println(impressora.listaImprimivel.isEmpty())
    impressora.deletarFilaImpressao()
    println(impressora.listaImprimivel.isEmpty())

}