package classes.IngressoEx

class IngressoPadrao(valor: Double) : Ingresso(valor) {

    override fun imprimeValor() {
        println("Ingresso Padrão R$ $valor")
    }

}