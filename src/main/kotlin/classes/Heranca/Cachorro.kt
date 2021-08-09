package classes.Heranca

class Cachorro: Animal() {

    override fun correr() {
        super.correr()
        println("Cachorro está correndo")
    }

}