//open class Pessoa{
open class Pessoa {

    fun comer(){
        println("comer")
    }
    fun caminhar(){
        println("caminhar")
    }
    fun trabalhar(){
        println("trabalhar")
    }
    fun namorar(){
        println("namorar")
    }
    fun casar(){
        println("casar")
    }
    fun chata(){
        println("ser chata")
    }
    fun engracada(){
        println("engraçada")
    }
    fun rancorasa() {
        println("rancorosa")
    }
}




class Diego: Pessoa(){

}
class Joelma: Pessoa(){

}

fun main(args: Array<String>) {

    val diego = Diego()



    val joelma= Joelma()
}