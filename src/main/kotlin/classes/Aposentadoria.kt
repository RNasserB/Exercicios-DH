package classes

class Aposentadoria(var idade: Int, val sexo: String, var anosContribuicao: Int) {

    fun podeAposentar(): Boolean {

        return ((sexo == "Feminino" && idade >= 60 && anosContribuicao >= 30) ||
                (sexo == "Masculino" && idade >= 65 && anosContribuicao >= 30))

    }

}