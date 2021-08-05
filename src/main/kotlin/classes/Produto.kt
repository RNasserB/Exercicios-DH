
package classes

class Produto(var listaNumeros: List<Int>){

    fun produtoFinal(): Int{
        var resultado = 1
        if (listaNumeros.isEmpty()){
            return 0
        } else {
            for (num in listaNumeros) {
                resultado *= num
            }
            return resultado
        }
    }
}