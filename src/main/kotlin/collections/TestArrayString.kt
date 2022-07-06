package collections

fun main() {

    //Maneira Verbosa

    val nomes = Array(3) {""}
    nomes[0] = "João"
    nomes[1] = "Maria"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("------------")
    nomes.sort()
    nomes.forEach { println(it) }


    //Maneira não Verbosa

    println("------------")
    val nomes2 = arrayOf("Maria", "Zaza", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}