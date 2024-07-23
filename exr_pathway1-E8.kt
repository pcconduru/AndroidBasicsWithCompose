//Alternando os nomes para ficarem no padrão camelCase para maior legibilidade
fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val CaloriesBurnedForEachStep = 0.04
    val TotalCaloriesBurned = numberOfSteps * CaloriesBurnedForEachStep
    return TotalCaloriesBurned
}