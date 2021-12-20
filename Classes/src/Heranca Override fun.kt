open class GuardaRoupa {

    fun Baton() {
        println("Batom")
    }

    fun Hidratante() {
        println("Hidratante")
    }

    fun Camisas() {
        println("Camisas")
    }

    open fun Calças() {
        println("Calças")
    }

    fun meias() {
        println("Meias")
    }
}

class Gaveta1 : GuardaRoupa() {
    override fun Calças() {//subescrevendo calças por vestido
        println("Vestidos")
    }
}

class Gaveta2 : GuardaRoupa() {

}

fun main(args: Array<String>) {//onde roda tudo
    val gaveta1 = Gaveta1()
    gaveta1.Baton()
    gaveta1.Hidratante()
    gaveta1.Calças()//subescrevendo calças por vestido

    val gaveta2 = Gaveta2()
    gaveta2.Calças()
    gaveta2.Camisas()
}
