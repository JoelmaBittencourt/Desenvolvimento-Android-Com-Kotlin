fun main(args: Array<String>) {


    var listaItens1 = listOf("SP", "RJ", "MJ")

    var listaItens = arrayListOf("SP", "RJ", "MJ")
    listaItens.add("BA")//adiciona BH na lista
    listaItens.remove("SP")//remove sp
    listaItens.removeAt(0)//remove pelo indice,,numero correspondente
    listaItens[0] = "MA"

    println(listaItens.size)
    println(listaItens.isEmpty())//lista vazia? boolean
    println(listaItens)
    println(listaItens1)
}
