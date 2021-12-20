open class Humano {

    fun comer() {
        println("comer")
    }

    fun caminhar() {
        println("caminhar")
    }

    fun trabalhar() {
        println("trabalhar")
    }

    fun namorar() {
        println("namorar")
    }

    fun casar() {
        println("casar")
    }

    fun chata() {
        println("ser chata")
    }

    fun engracada() {
        println("engraçada")
    }

    fun rancorasa() {
        println("rancorosa")
    }
}


class Diego : Humano() {

}

class Jojoh : Humano() {

}

fun main(args: Array<String>) {

    val diego = Diego()
    println("Diego é")
    diego.chata()
    diego.comer()
    diego.rancorasa()

    val jojoh = Jojoh()
    println("Joelma é")
    jojoh.namorar()
    jojoh.caminhar()
}