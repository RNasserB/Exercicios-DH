package classes.FaturaEx2

open class Item(
    val numeroItem: Int,
    val descricao: String,
    var quantidadeComprada: Int,
    var preçoUnitario: Double
) {

    init {
        if (quantidadeComprada < 0) {
            quantidadeComprada = 0
        }
        if (preçoUnitario < 0) {
            preçoUnitario = 0.0
        }
    }


}