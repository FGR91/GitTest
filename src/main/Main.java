/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Operaciones;

/**
 *
 * @author FGR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Operaciones.Multiplicar(2, 3));
        System.out.println(Operaciones.Multiplicar(10.0, 1.16));
        System.out.println(Operaciones.Sumar(1, 2));
        System.out.println(Operaciones.Sumar(4.2, 0.3));
    }
    
}
