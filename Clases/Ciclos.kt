package Clases

class Ciclos {


}

fun main(){
    print("Cuantas veces quiere jugar?")
    var times = readLine()!!.toInt()

    for (i in 1..times) {
        println("Escoge cara o sello")
        var escoge: String = readLine()!!.toString().uppercase()
        val aleatorio = 0..1
        val random:Int = aleatorio.random()
        println (escoge)
        println(random)
        if (escoge == "cara" && random == 0 || escoge == "sello" && random ==1) {
            println("USTED HA GANADO, MUY BIEN")
        }else if ((escoge == "sello" && random == 0) || (escoge == "cara" && random == 1)) {
            println("USTED HA PERDIDO, QUE TRISTE")
        }
        println("fin")
    }




}