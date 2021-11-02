import kotlinx.coroutines.*

fun main() {
	repeat(3) {
        GlobalScope.launch {
            println("Hola, desde ${Thread.currentThread()}")
        }
    }
}