//Aprendendo a usar parametro 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    println("$firstNumber + $secondNumber = " + add(firstNumber, secondNumber))
    println("$firstNumber + $thirdNumber = " + add(firstNumber, thirdNumber))
}

fun add(NumeroSoma1: Int, NumeroSoma2: Int): Int{
    return NumeroSoma1 + NumeroSoma2
}