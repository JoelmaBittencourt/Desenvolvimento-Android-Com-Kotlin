fun main(args: Array<String>) {

    var texto: String? = null//pode ou nao receber um valor,se nao recer,sera nula
    texto = "joelma"
    //  println(texto)//nao pode definir variavel nula
    println(texto.length)//nao funciona se nao atribuir nada pq nulo nao recebe nada
    println(texto?.length)//testa  se nao esta nulo para usar o length
    println(texto!!.length)//nao pode ser nulo
//    if (texto != null){
//        println(texto.length)
//    }
}