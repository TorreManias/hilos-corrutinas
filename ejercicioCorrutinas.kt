import kotlinx.coroutines.*

fun main() {
	val estados = arrayOf("Iniciando", "Tarea 1", "Tarea 2", "Finalizando")
    repeat(3) {
        GlobalScope.launch {
            println("${Thread.currentThread()} ha iniciado.")
            
            for (i in estados) {
                println("${Thread.currentThread()} - $i")
                delay(5000)
            }
        }
    }
}