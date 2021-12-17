fun main(args: Array<String>) {
    var opcao = 1
    var resultado = when(opcao){
        1 ->"cafe"
        2-> "leite"
        else -> "escolha uma"
    }
    println(resultado)
}