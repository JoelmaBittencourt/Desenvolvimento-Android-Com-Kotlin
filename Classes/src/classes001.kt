class Casa {

    //PROPRIEDADES
    var cor: String = " "

    //METODOS
    fun abrirJanela(qtdJanelas: Int) {
        println("Abrir janela $qtdJanelas")
    }

    fun abrirPorta() {
        println("abrir porta")
    }

    fun abrirCasa() {
      //  this.abrirJanela()
        this.abrirPorta()
    }
}

fun main(args: Array<String>) {

    val casa = Casa()
    casa.cor = "Amarela"
    casa.abrirJanela(10)


    println(casa.cor)


}