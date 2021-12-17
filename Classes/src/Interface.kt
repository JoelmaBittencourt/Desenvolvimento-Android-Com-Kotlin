interface Presidenta {
    //para ser presidente precisa
    fun ganharEleicao()//precisa ganhar eleicao
}


open class Pessoa {
    // sem o open nao da para utilizar herança
    fun direitosEDeveres() {
        println("todos tem direitos e deveres")
    }

}

class Joelma : Pessoa(), Presidenta {
    //pode adicionar varias interfaces
    override fun ganharEleicao() {
        println("Ganhar eleicao")
    }

}


class Jo : Pessoa() {//herda da classe pessoa


}

fun main(args: Array<String>) {

    val joelma = Joelma()
    joelma.direitosEDeveres()
    joelma.ganharEleicao()
    val jo = Jo()
    jo.direitosEDeveres()
}
