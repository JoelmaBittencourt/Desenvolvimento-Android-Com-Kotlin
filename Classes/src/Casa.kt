class Casa {

    //PROPRIEDADE
    var cor: String = ""
    var paredes: Int = 6

    //METODOS
    fun abrirJanela() {//primeira letra sempre minuscula
        println("Abrir janela")
    }

    fun abrirPorta() {
        println("Abrir porta")
    }

    fun abrirCasa() {//chama todos os metodos,como se colocasse tudo dentro de abrir casa
        this.abrirPorta()
        this.abrirJanela()
    }
}


fun main(args: Array<String>) {
    val casa = Casa()//instanciando casa
    casa.cor = " casa Amarela"
    casa.abrirCasa()
    //println(casa.cor)

}
//class Casa {
//
//    //Propriedades
//    var cor: String = ""
//
//    //Métodos
//    fun abrirJanela(qtdJanelas: Int){
//        println("Abrir janela total: $qtdJanelas ")
//    }
//
//    fun abrirPorta(){
//        println("Abrir porta")
//    }
//
//    fun abrirCasa(){
//        //this.abrirJanela()
//        this.abrirPorta()
//    }
//
//}
//fun main(args: Array<String>) {
//
//
//    val casa = Casa()
//    casa.cor = "Amarela"
//    casa.abrirJanela( 10 )
//
//    val casa2 = Casa()
//    casa2.cor = "Vermelha"
//
//
//    println(casa.cor)
//    println(casa2.cor)
//
//
//}