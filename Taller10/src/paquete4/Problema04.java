/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema04 {

//Realice un proceso que permita ingresar los valores por teclado para el siguiente arreglo
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("Ingrese el dato para el arreglo");
                datos[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("El arreglo resultante es:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%.2f\t",
                        datos[i][j]);
            }
            System.out.println();
        }
    }
}
