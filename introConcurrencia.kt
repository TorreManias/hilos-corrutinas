fun main() {
    val estados = arrayOf("Iniciando", "Tarea 1", "Tarea 2", "Finalizando")
    
    repeat(3) {
        Thread {
            println("${Thread.currentThread()} ha iniciado")
            for (i in estados) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    }
}