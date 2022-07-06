package collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-+-------+-")
    println("Maior Salario:${salarios.maxOf { it }}")
    println("Menor Salario:${salarios.minOf { it }}")
    println("Media Salarial: ${salarios.average()}")


    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-+-------+-")
    salariosMaiorQue2500.forEach{println(it)}

    val salariosMaiorQue500 = salarios.filter { it > 500.0 }
    println("-+-------+-")
    salariosMaiorQue500.forEach{println(it)}

    val salariosMaiorQue1000 = salarios.filter { it > 1000.0 }
    println("-+-------+-")
    salariosMaiorQue1000.forEach{println(it)}
}