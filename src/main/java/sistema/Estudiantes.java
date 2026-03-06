package sistema;


public class Estudiantes {
    private String nombre;
    private int edad;
    private double nota;
    private double nota2;
    private double nota3;

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

    // Metodo que retorna un texto si el estudiante aprobo o no  // refornamdo para mejor claridad
    public boolean aprobado(){
        return calcularPromedio() >= 3;
    }

    // Metodo para calcular las notas similar a promedio
    public double calcularNota(double nota, double nota2, double nota3){
        return (nota + nota2 + nota3) / 3;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
