open class Mercado{
    fun Arroz(){
println("Arroz")
    }
    fun Feijao(){
println("feijao")
    }
    fun Macarrao(){
println("Macarrao")
    }
    fun Biscoito(){
println("Biscoito")
    }
    fun Acucar(){
println("Açucar")
    }
    fun Bolacha(){
println("Bolacha")
    }
    fun Refrigerante(){
println("Refrigerante")
    }
    open fun Sorvete() {
        println("Sorvete")
    }
    }
    class Carrinho : Mercado(){
}
class Carrinho2 : Mercado(){
override fun Sorvete(){
    println("Sorvete de massa")
}
}




fun main(args: Array<String>) {//onde roda tudo

  val  carrinho = Carrinho()
    carrinho.Acucar()
    carrinho.Arroz()
    carrinho.Bolacha()



    val carrinho2= Carrinho2()
    carrinho2.Sorvete()
    carrinho2.Feijao()
    carrinho.Refrigerante()
    carrinho.Macarrao()
}