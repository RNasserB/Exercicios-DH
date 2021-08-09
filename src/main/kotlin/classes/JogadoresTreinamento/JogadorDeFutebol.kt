package classes.JogadoresTreinamento

class JogadorDeFutebol(val nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol() {
        if (energia >= 5) {
            energia -= 5
            alegria += 10
            gols += 1
            println("GOOOOL!")
        } else {
            println("Sem Energia")
        }
        }

        fun correr() {
            if (energia >= 10) {
                energia -= 10
                println("Cansei")
            } else {
                println("Sem Energia")
            }
        }

    }