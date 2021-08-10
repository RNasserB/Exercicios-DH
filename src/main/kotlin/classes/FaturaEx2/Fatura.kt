package classes.FaturaEx2

class Fatura(var listaItens: ArrayList<Item>) {


    fun totalDaFatura(): Double {
        var resultado = 0.0

        listaItens.forEach() { resultado = ((resultado + it.quantidadeComprada) * it.preçoUnitario) }
        listaItens.forEach() { resultado += (it.quantidadeComprada * it.preçoUnitario) }
        return resultado

    }

}