package collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println("-------=------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-------=------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it) }

    println("-------=------")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach{ println(it) }
}