package classes.Lambda

fun main(){
    println(soma(2.0,4.0))
    println(subtracao(-2.0, -4.0))
    println(multiplicacao(2.0, 4.0))
    println(divisao(2.0,4.0))
    println(divisao(4.0,2.0))
    println(divisao(2.0,0.0))
}

val soma = {num1: Double, num2: Double -> num1 + num2}
val subtracao = {num1: Double, num2: Double -> num1 - num2}
val multiplicacao = {num1: Double, num2: Double -> num1 * num2}
val divisao = {
        num1: Double, num2: Double ->
    if (num2 != 0.0) (num1/num2 as Double)
    else "não é possível dividir por zero"
}