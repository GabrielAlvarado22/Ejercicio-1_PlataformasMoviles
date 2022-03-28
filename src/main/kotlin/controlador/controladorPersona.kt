package controlador
import modelo.Persona
import kotlin.math.*

class controladorPersona {

    /*fun pot( a: Double,  b: Int): Double {
        var result:Double = 1.0
        for(i in 1..b)
            result = result*a
        return result
    }*/

    fun calcularIMC(peso: Double, altura: Double): Int{
        var pesoIdeal:Double
        pesoIdeal = (peso/altura.pow(2))

        if(pesoIdeal<18.5){
            return -1
        }
        else if(pesoIdeal==18.5){
            return 0
        }
        else{
            return 1
        }
    }

    fun esMayorDeEdad(edad: Int): Boolean{
        return edad>17
    }

    fun comprobarSexo(p : Persona){
        if(p.sexo=='H' || p.sexo=='M') {
            p.sexo= p.sexo
        }
        else{
            p.sexo = 'H'
        }
    }

    fun toString(p : Persona) = "Informacion personal: \n" +
            "Nombre: ${p.nombre} \n" + "Edad: ${p.edad} \n" + "Sexo: ${p.sexo} \n" + "Cedula: ${p.cedula} \n" + "Peso: ${p.peso} \n" + "Altura: ${p.altura} \n"


    fun verificarPesoIdeal(p: Persona){
        if(calcularIMC(p.peso, p.altura)==-1){
            println("${p.nombre} esta por debajo de su peso")
        }
        else if (calcularIMC(p.peso, p.altura)==0){
            println("${p.nombre} esta en su peso ideal")
        }
        else{
            println("${p.nombre} posee sobrepeso")
        }
    }

    fun verificarMayoriaEdad(p: Persona){
        if(esMayorDeEdad(p.edad)){
            println("${p.nombre} es mayor de edad")
        }
        else{
            println("${p.nombre} es menor de edad")
        }
    }
}