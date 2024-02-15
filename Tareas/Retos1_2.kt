package Tareas

class Retos1_2 {
}

fun main(){

    //ejercicio numero 1
    println ("Digite la temperatura en grados Centigrados")
    var temp:Double = readLine()!!.toDouble()
    var res = (temp-32)/1.8
    //println ("La temperatura en grados centigrados es $res")
    //ejercicio numero 2
    println ("Digite la edad de tu bebe")
    var edad:Double = readLine()!!.toDouble()
    println("Ingrese el peso de su bebé")
    var peso:Double = readLine()!!.toDouble()
    var dosis = ((peso+10)/(edad * 10))*8
    println("la dosis de la vacuna es $dosis")
}
