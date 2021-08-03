package classes

class Produto(var listaNum: Array<Int> = arrayOf()) {

    fun produtoFinal(listaNum: Array<Int>): Int {
        var resultado = 1
        for (i in listaNum) {
            resultado *= listaNum[i]
        }
        return resultado
    }

}