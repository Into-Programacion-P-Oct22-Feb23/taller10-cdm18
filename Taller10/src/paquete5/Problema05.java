/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Imprima en pantalla a través de una variable acumuladora solo los estudiantes que tienen como primera letra S,P,T
package paquete5;

/**
 *
 * @author cdm124
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String mensaje = "";
        char estudiante;
        String letra;

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                estudiante = estudiantes[i][j].charAt(0);
                letra = String.valueOf(estudiante);
                
                if (letra.startsWith("P")
                        || letra.startsWith("S") 
                        || letra.startsWith("T")) {
                    
                    mensaje = mensaje + estudiantes[i][j] + "\n";
                }
                // || estudiantes[i][j].startsWith("P", j)
                //  || estudiantes[i][j].startsWith("T", j)) {
                //     estudiantes[i][j] = estudiante;
                //   mensaje = estudiantes[i][j];

            }

        }
        System.out.printf("%s", mensaje);

    }
}
