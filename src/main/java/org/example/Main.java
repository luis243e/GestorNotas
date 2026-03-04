package org.example;

import sistema.Estudiantes;

public class Main {
    public static void main(String[] args) {
        // Instanciamos la clase Estudiantes y le asignamos los valores manualmente a cada uno de los estudiantes
        Estudiantes estudiante1 = new Estudiantes("jaun", 18, 4, 5, 4);
        Estudiantes estudiante2 = new Estudiantes("alejandro", 20, 2, 1, 3);
        Estudiantes estudiante3 = new Estudiantes("jaun", 23, 3, 4, 2);

        // Utilizamos los metodos creados en la clase estudiantes para
        System.out.println("Su promedio es de: " + estudiante1.calcularPromedio() + " Aprobado: " + estudiante1.aprobado());
        System.out.println("Su promedio es de: " + estudiante2.calcularPromedio() + " Aprobado: " + estudiante2.aprobado());
        System.out.println("Su promedio es de: " + estudiante3.calcularPromedio() + " Aprobado: " + estudiante3.aprobado());
    }
}