package collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    salarios

    println("------------")
    println(salarios.somatoria())

    println("------------")
    println(salarios.media())
}