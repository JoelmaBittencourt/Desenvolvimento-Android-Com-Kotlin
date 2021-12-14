fun exibirMensagem(nome:String) {
    println("alertas $nome!!")
}
fun somar(num1:Int,num2:Int): Int{
    var total=num1+num2
    return total
//println(total)
}


fun main(args: Array<String>){


    exibirMensagem("joelma")
    var resultado= somar(10,5)
    println(resultado)
   // exibirMensagem()
}