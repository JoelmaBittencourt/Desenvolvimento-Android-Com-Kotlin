class Casas() {

    //PROPRIEDADES
    var cor: String = " "
    var vagasGaragem: Int = 0


    //METODOS
    fun detalhesCasa() {
        println("A casa tem a cor: $cor:,vagas: $vagasGaragem")
    }

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

    val casas = Casas()
    casas.cor = "Amarela"
    casas.abrirJanela(10)

    casas.detalhesCasa()


}