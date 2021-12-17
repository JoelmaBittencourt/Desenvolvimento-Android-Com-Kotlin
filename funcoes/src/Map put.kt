fun main(args: Array<String>) {

    var map = hashMapOf(//juncao de informacoes
        //  "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem"
    )
  //  println(map)
    map.put("passaro", "gosta de voar")//adiciona mais um argumento
    map.remove("passaro")//remove o passaro
    // for (item in map)
    for (item in map.values)//exibe apenas os valores semm as chaves
    {
        println(item)
    }
}