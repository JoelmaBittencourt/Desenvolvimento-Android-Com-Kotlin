

class Casa1( var cor: String, var vagasGaragem: Int ) {

    //Propriedades
    /*
    var cor: String
    var vagasGaragem: Int

    constructor( cor: String, vagasGaragem: Int  ){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }*/

    /*
    init{
       this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    */

    //Métodos
    fun detalhesCasa1(){
        println("A casa tem a cor: $cor, vagas: $vagasGaragem ")
    }

    fun abrirJanela(qtdJanelas: Int){
        println("Abrir janela total: $qtdJanelas ")
    }

    fun abrirPorta(){
        println("Abrir porta")
    }

    fun abrirCasa(){
        //this.abrirJanela()
        this.abrirPorta()
    }

}
fun main(args: Array<String>) {

    val casa = Casa1("Amarela", 2)

    casa.detalhesCasa1()

}
