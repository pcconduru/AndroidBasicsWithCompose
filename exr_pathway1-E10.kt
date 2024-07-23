//Comparador de Horas gastas no telefone
fun main() {
    val tempoGastoHoje = 155
    val tempoGastoOntem = 150
    
    println("Gasto de hoje foi maior do que ontem: " + comparador(tempoGastoHoje, tempoGastoOntem))
}
fun comparador(tgh: Int, tgo: Int): Boolean{
    return tgh > tgo
}