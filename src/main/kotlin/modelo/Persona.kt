package modelo

class Persona{
    var nombre : String
    var edad : Int
    var cedula : String
    var sexo : Char
    var peso : Double
    var altura : Double

    init{
        nombre = ""
        edad = 0
        cedula = ""
        sexo = ' '
        peso = 0.0
        altura = 0.0
    }

    constructor(){
        nombre = "Gabriel"
        edad = 23
        cedula = "207890236"
        sexo = 'H'
        peso = 65.0
        altura = 1.74
    }

   constructor(nombre_p: String, edad_p : Int, cedula_p: String, sexo_p: Char, peso_p: Double, altura_p: Double){
       this.nombre = nombre_p
       this.edad = edad_p
       this.cedula = cedula_p
       this.sexo = sexo_p
       this.peso = peso_p
       this.altura = altura_p
    }

    constructor(nombre_p: String, edad_p: Int, sexo_p: Char):
            this(nombre_p, edad_p, "111111111", sexo_p, 80.0, 1.70) {
        this.nombre = nombre_p
        this.edad = edad_p
        this.sexo = sexo_p
    }
}