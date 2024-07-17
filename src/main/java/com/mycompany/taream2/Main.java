/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taream2;

/**
 *
 * @author Michel Enamorado
 */
public class Main {
        public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        // Llamar al primer método
        String mensaje = operaciones.obtenerMensaje();
        System.out.println(mensaje);

        // Llamar al segundo método con diferentes edades
        int edad1 = 20;
        int edad2 = 22;
        System.out.println("Edad " + edad1 + ": " + operaciones.verificarEdad(edad1));
        System.out.println("Edad " + edad2 + ": " + operaciones.verificarEdad(edad2));

        // Llamar al tercer método con diferentes valores
        int a = 5;
        int b = 3;
        System.out.println("Multiplicacion de " + a + " y " + b + ": " + operaciones.multiplicar(a, b));

        // Llamar al cuarto método con diferentes valores
        int x = 10;
        System.out.println("Lista de numeros del 1 al " + x + ": " + operaciones.listaNumeros(x));
    }
    
}
