//Função de clima para evitar repetições desnecessárias
fun main() {
    val city = "Brasilia"
    val htemp = 30
    val ltemp = 10
    val rain = 25
    println(clima(city, htemp, ltemp, rain))
}
fun clima(cidade: String, lTemp: Int, hTemp: Int, chuva: Int): String {
    return "City: $cidade\nLow Temperature: $lTemp, High Temperature: $hTemp\nChance of Rain: $chuva%"
}