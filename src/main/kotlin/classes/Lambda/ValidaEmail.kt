package classes.Lambda

fun main(){
    val text = "email@bla@uol.com"
    val text2 = "email@uol.com.br"
    val text3 = "email-email@uol.com"

    val emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    val isEmailValid = {email:String -> emailRegex.toRegex().matches(email)}


    println(isEmailValid(text))
    println(isEmailValid(text2))
    println(isEmailValid(text3))
}