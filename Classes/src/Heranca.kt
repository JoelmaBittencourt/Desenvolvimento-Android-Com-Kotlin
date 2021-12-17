open class Animal {
    fun dormir() {
        println("dormir")
    }

    fun latir() {
        println("latir")
    }

    fun voar() {
        println("voar")
    }

    fun morder() {
        println("morder")
    }

    fun correr() {
        println("correr")
    }

    fun bicar() {
        println("bicar")
    }

    fun comer() {
        println("comer")
    }
}

class Cao : Animal() {

}


class Passaro : Animal() {


}


fun main(args: Array<String>) {
    val passaro = Passaro()
    passaro.dormir()
    passaro.voar()
    passaro.bicar()


    val cao = Cao()
    cao.latir()
    cao.dormir()
    cao.comer()
    cao.morder()
}




