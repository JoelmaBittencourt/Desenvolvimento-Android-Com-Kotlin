fun main(args: Array<String>) {

    var idade = 1

    if (idade <= 10 && idade >= 2) {
        println("Criança")

    } else if (idade >= 18) {
        println("Adulto")

    } else if (idade <= 17 && idade >= 15) {
        println("Adolescente")

    } else {
        println("idade invalida")
    }
}