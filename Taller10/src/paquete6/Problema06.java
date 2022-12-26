/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
//Imprima en pantalla a través de una variable acumuladora solo 
//los estudiantes que tengan 11 caracteres
//(se cuentan también los espacios en blanco) "Lauren Rice" "Lori Flores" "Steven West" "Toni Martin"

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String mensaje = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                
                if (estudiantes[i][j].length() == 11) {
                    mensaje = mensaje + estudiantes[i][j] + "\n";
                }
            }
        }
        System.out.printf("%s", mensaje);
    }
}
