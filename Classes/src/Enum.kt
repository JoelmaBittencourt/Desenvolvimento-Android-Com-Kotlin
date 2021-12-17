enum class StatusPedido {
    PROCESSANDO,
    APROVADO,
    REPROVADO
}
class Pedido {
    var status: StatusPedido = StatusPedido.PROCESSANDO
}
fun main(args: Array<String>) {
    val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO

    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("Pedido esta sendo processado!")

    } else if (pedido.status == StatusPedido.APROVADO) {
        println("Pedido foi aprovado!")
    }
}