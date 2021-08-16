package classes.IngressoEx

class IngressoVip(valor: Double) : Ingresso(valor) {

    override fun imprimeValor() {
        val precoVip = 5.0
        val valorFinal = valor + precoVip
        println("Ingresso Vip R$ $valorFinal")
    }

}