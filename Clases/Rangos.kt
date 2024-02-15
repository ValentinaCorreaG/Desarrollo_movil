package Clases

class Rangos {
}
fun main(){
    println("Digite un número")
    var num:Int = readLine()!!.toInt()

    if (num in 1..10) {
        println("El numero ${num} está dentro del rango")
    }else{
        println("El número ${num} no está dentro del rango")
    }
    //ahora con letras a ver si está en el rango
    println("Digite una letra")
    var let:String = readLine()!!.toString().uppercase()
    var ed:Int = readLine()!!.toInt()

    if (ed in 0..17) {
        println("Vaya a dormir bebé que no lo dejan entrar")
    }else if (ed in 18..60){
        println("Siga siga, viva la farra")
    }else{
        println("Vaya a dormir que ya está como viejito para esto")
    }
}