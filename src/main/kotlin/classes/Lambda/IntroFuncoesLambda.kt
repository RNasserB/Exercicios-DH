package classes.Lambda

fun main() {

    //Conteúdo para estudo -> https://play.kotlinlang.org/byExample/04_functional/02_Lambdas
    //Conteúdo para estudo -> https://br.atsit.in/archives/65253
    //Conteúdo para estudo -> https://code.tutsplus.com/pt/tutorials/kotlin-from-scratch-more-functions--cms-29479

    //Exemplo simples, retornando UNIT
    val soma = { a: Int, b: Int -> println(a + b) }

    //Exemplo simples retornando valor, não mais UNIT
    val somaComRetorno: (Int, Int) -> Int = {a: Int, b: Int -> a + b}

    //Exemplo mais detalhado em relacao aos parametros e retorno UNIT
    val somaDeOutraFormaEPrinta: (Int, Int) -> Unit = { a: Int, b: Int -> println(a + b) }

    //Exemplo mais detalhado em relacao aos parametros porém simplificado após chave e retorno UNIT
    val somaDeOutraFormaEPrintaSimplificado: (Int, Int) -> Unit = { a, b -> println(a + b) }

    //Exemplo com retorno de String
    val somaDeOutraFormaERetornaString: (Int, Int) -> String = { a: Int, b: Int ->
        val resultado = a + b
        "$resultado"
    }

    //Exemplo com um unico parametro, para usar o IT
    val somaComUmUnicoParametro: (Int) -> Int = {
        it + 10
    }

    /**
     * a função lambda retorna sempre a ultima linha
     * caso seja um valor, ele será retornado e caso seja uma execução como: println()
     * será retornado Unit
     * É necessário caso faça conforme o exemplo abaixo
     * informar o tipo de retorno, seja Unit ou valor como (Int, Double, Float, Boolean, String)
     */
    //Exemplo recebendo list como parametro e printnado apenas os números pares
    val listaFiltrada: (List<Int>) -> Unit = {
        for(item in it){
            if(item % 2 == 0){
                println(item)
            }
        }
    }
    /**
     * a função lambda retorna sempre a ultima linha
     * caso seja um valor, ele será retornado e caso seja uma execução como: println()
     * será retornado Unit
     * É necessário caso faça conforme o exemplo abaixo informar o tipo de retorno exceto para Units
     */
    val listaFiltradaSimples = { list: List<Int> ->
        list.filter { it % 2 == 0 }
    }


    val imprimeLista: (List<Int>) -> Unit = {
        for(item in it){
            println(item)
        }
    }

    //passar como parametro
    val processador = { texto: String -> println("O valor é $texto") }

    imprimeLista(listaFiltradaSimples(listOf(1,2,3,4,5,6,7,8,9,10)))
    listaFiltrada(listOf(1,2,3,4,5,6,7,8,9,10))
    println(somaComUmUnicoParametro(10))
    soma(10, 10)
    somaDeOutraFormaEPrinta(10, 10)
    somaDeOutraFormaEPrintaSimplificado(11,11)
    println(somaDeOutraFormaERetornaString(10, 10))
    val texto = listOf("O", "Jonatas", "roubou", "pão", "na", "casa", "do", "Joao")
    processamento(texto,processador)
    println(somatorio(100,100,somaComRetorno))
}


fun somatorio(a: Int, b: Int, calculador: (Int, Int) -> Int): Int{
    return calculador(a, b)
}

fun processamento(languages: List<String>, texto: (String) -> Unit) {
    languages.forEach(texto)
}