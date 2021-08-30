package classes.Ex1Aula12


fun main() {
    var pessoaA = PessoaDois("Ricardo", 123456)
    var pessoaB = PessoaDois("Ricardo",123456 )

    println(pessoaA.toString())
    println(pessoaB.toString())
    println(pessoaA.hashCode())
    println(pessoaB.hashCode())
    println(pessoaA == pessoaB)
}