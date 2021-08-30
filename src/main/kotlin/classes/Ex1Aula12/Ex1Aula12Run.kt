package classes.Ex1Aula12

fun main() {

    val pessoaA = Pessoa("Ricardo", 12345678)
    val pessoaB = Pessoa("Arthur", 12345678)



    println (pessoaA == pessoaB) //false primeiro e depois true
    println(pessoaA)
    println(pessoaA.hashCode())

}