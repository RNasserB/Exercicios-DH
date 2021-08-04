
package classes

class Produto(var listaNumeros: List<Int>){

    fun produtoFinal(): Int{
        var resultado: Int = 1
        for (num in listaNumeros){
            resultado *= num
        }
        return resultado
    }
}