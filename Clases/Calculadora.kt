package Clases

import kotlin.math.sqrt

class Calculadora {

}

fun main(){
    println("Digite dos números")
    var num1:Double=readLine()!!.toDouble()
    var num2:Double=readLine()!!.toDouble()
    println("Qué operación quiere hacer: escribalo en MAYUSCULAS")
    var ope:String=readLine()!!.toString()
    var res:Int=0
    when (ope){
        "SUMA" -> println("la suma de los números dados es: " + (num1 + num2))
        "RESTA" -> println("la resta de los números dados es: " + (num1 - num2))
        "MULTIPLICACION" -> println("la multiplicación de los números dados es: " + num1 * num2)
        "DIVISION" ->  println("la división de los números dados es: " +  (num1/num2))
        "RAIZ" -> println("la raíz cuadrada de el primer numero es: "+ (sqrt(num1))+"la raíz cuadrada de el segundo número es" + (sqrt(num2)))
        "POTENCIA" -> println("$num1 ** $num2 = ${Math.pow(num1.toDouble(), num2.toDouble())}")
    }

}