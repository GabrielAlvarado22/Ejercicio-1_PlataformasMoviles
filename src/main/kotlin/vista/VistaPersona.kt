package vista
import modelo.Persona
import controlador.controladorPersona
import kotlin.coroutines.Continuation

class VistaPersona {
    val c = controladorPersona()
    fun menu(){

        println("Digite su nombre:")
        var nombre=readLine()!!.toString()

        println("Digite su cedula:")
        var cedula=readLine()!!.toString()

        println("Digite su edad:")
        var edad=readLine()!!.toInt()

        println("Digite su sexo:")
        var sexoString=readLine()!!.toString()
        var sexo = sexoString.first()

        println("Digite su peso:")
        var peso=readLine()!!.toDouble()

        println("Digite su altura:")
        var altura=readLine()!!.toDouble()

        //OBJETO  1
        val persona1 = Persona(nombre, edad, cedula, sexo, peso, altura)
        c.comprobarSexo(persona1)
        println("OBJETO 1\n")
        println("\n"+c.verificarPesoIdeal(persona1))
        println("\n"+c.verificarMayoriaEdad(persona1))
        println("\n"+c.toString(persona1))

        //OBJETO  2
        val persona2 = Persona(nombre, edad, sexo)
        c.comprobarSexo(persona2)
        println("\n\nOBJETO 2\n")
        println("\n"+c.verificarPesoIdeal(persona2))
        println("\n"+c.verificarMayoriaEdad(persona2))
        println("\n"+c.toString(persona2))

        //OBJETO 3
        val persona3 = Persona()
        c.comprobarSexo(persona3)
        println("\n\nOBJETO 3\n")
        println("\n"+c.verificarPesoIdeal(persona3))
        println("\n"+c.verificarMayoriaEdad(persona3))
        println("\n"+c.toString(persona3))
    }
}