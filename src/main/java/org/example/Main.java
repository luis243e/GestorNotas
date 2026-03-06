package org.example;

import sistema.Estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Estudiantes> estudiantes = new ArrayList<>(); // usamos un ArrayList de tipo "Estudiantes" y le damos el nombre de "estudiantes"
        int opcion, numeroEstudiantes;

        // Designamos el numero de estudiantes ingresados
        while (true){
            System.out.println("Ingrese el numero de estudiantes");
            numeroEstudiantes = leer.nextInt();
            if(numeroEstudiantes <= 0){
                System.out.println("El numero de estudiantes es negativo vuelva a ingresarlo: ");
                numeroEstudiantes = leer.nextInt();
            } else{
                while(estudiantes.size()<numeroEstudiantes){

                    // Le pedimos los datos del estudiante al usuario
                    System.out.println("Ingrese el nombre de estudiantes");
                    String nombre = leer.next();
                    System.out.println("Ingrese la edad del estudiante");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese la nota1 del estudiante");
                    double nota1 = leer.nextDouble();
                    System.out.println("Ingrese la nota2 del estudiante");
                    double nota2 = leer.nextDouble();
                    System.out.println("Ingrese la nota3 del estudiante");
                    double nota3 = leer.nextDouble();

                    // Creamos el objeto estudiante y lo asignamos a nuestro ArrayList
                    Estudiantes estudiante = new Estudiantes(nombre, edad, nota1, nota2, nota3);

                    estudiantes.add(estudiante);
                }
                break;
            }
        }


        // Menu de opciones a elegir
        while (true){
            System.out.println("Bienvenido estudiante");
            System.out.println("""
                    1. ver su promedio
                    2. Saber si aprobo el curso
                    3. Calculadora de notas
                    0. Salir
                    """);
            System.out.println("Elija una opcion:  ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
        System.out.println("Ingrese el nombre del estudiante a buscar");
        String nombre = leer.next();
        // Por medio del medio de la libreria stream buscamos a un estudiante por el nombre
        Estudiantes estudianteEncontrado = estudiantes.stream()
                .filter(
                        (estudiante) -> estudiante.getNombre().equalsIgnoreCase(nombre))
                .findFirst().orElse(null);
                        if (estudianteEncontrado != null){
                            System.out.println("Estudiante encontrado");
                            System.out.println("Su promedio es: " + estudianteEncontrado.calcularPromedio());
                        } else{
                            System.out.println("estudiante no encontrado");
                        }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("ESTA ES UNA CALCULADORA DE NOTAS");
                    System.out.println("Ingrese su primera nota");
                    double nota = leer.nextDouble();
                    System.out.println("Ingrese su segunda nota");
                    double nota2 = leer.nextDouble();
                    System.out.println("Ingrese su tercera nota");
                    double nota3 = leer.nextDouble();
                    // Usamos una instancia local para llamar al metodo calcularNota.
                    Estudiantes calculadoraNotas = new Estudiantes();
                    double promedioCalculado = calculadoraNotas.calcularNota(nota, nota2, nota3);
                    System.out.println("Su promedio es: " + promedioCalculado);
                    System.out.println("Aprobo: " + (promedioCalculado >= 3));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }

}