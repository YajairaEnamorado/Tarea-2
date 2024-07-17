/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taream2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michel Enamorado
 */
public class Recursos {
    
}
class Operaciones {
    // Primer método: Retorna un mensaje
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos 2021";
    }

    // Segundo método: Retorna si es mayor de edad o menor de edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Retorna el resultado de una multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Retorna una lista de números del 1 al X
    public List<Integer> listaNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }
}
