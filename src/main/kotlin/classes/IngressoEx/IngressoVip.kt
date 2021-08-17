package classes.IngressoEx

class IngressoVip(valor: Double) : Ingresso(valor) {

    override fun imprimeValor() {
        val precoVip = 5.0
        println("Ingresso Vip R$ ${valor + precoVip}")
    }

}