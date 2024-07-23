//Aprendendo a usar parametro padrão com sistema de notificação falso
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(email = emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(sistema: String = "Unknown OS", email: String): String {
    return "There's a new sign-in request on $sistema for your Google Account $email"
}