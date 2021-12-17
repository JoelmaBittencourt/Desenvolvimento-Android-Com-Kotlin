fun main(args: Array<String>) {

    var postagens = arrayListOf(
        "Diabetes",
        "Cancer",
        "Lupus"    )




//    for (postagens in postagens) {//liste todas as postagens
//println(postagens)
//    }
    for ( (indice , postagens) in postagens.withIndex() ){  //liste todas as postagens
        println(" $indice - $postagens")//organiza tudo
}
}