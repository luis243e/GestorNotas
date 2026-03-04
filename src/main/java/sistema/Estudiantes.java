package sistema;

public class Estudiantes {
    public String nombre;
    public int edad;
    public double nota;
    public double nota2;
    public double nota3;

    // Creamos un constructor vacio el cual sera el default
    public Estudiantes(){

    }

    // Por medio de un constructor ponemos todos los atributos que creamos para poder utilizarlos luego
    public Estudiantes(String nombre, int edad, double nota, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Metodo que retorna el promedio acumulado de las notas del estudiante
    public double calcularPromedio() {
        return (this.nota + this.nota2 + this.nota3) / 3;
    }

    // Metodo que retorna un texto si el estudiante aprobo o no
    public Boolean aprobado(){
        if(calcularPromedio() >= 3){
            return  true;
        } else {
            return false;
        }
    }

}
