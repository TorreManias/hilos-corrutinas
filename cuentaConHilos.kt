fun main() {
    var cuenta = 0
    for (i in 1..50) {
        Thread {
            cuenta += 1
            println("Hilo: $i - Cuenta: $cuenta")
        }.start()
    }
}