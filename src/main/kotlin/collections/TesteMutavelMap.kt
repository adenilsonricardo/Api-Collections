package collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findByid(joao.nome))
    println(repositorio.findByid(pedro.nome))
    println(repositorio.findByid(maria.nome))

    println("---------")
    repositorio.findAll().forEach { println(it) }

    println("---------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}