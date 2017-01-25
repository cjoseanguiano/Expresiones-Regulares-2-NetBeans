/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones.regulares.pkg2;

import java.util.regex.Pattern;

/**
 *
 * @author carlosjoseanguiano
 */
public class ExpresionesRegulares2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String expresionRegular = "[abc]";
        String cadenaEvaluar = "d";
        boolean n = Pattern.matches(expresionRegular, cadenaEvaluar);

        if (n) {
            System.out.println("La expresion SI contiene el valor de: " + cadenaEvaluar);
        } else {
            System.out.println("La expresion NO contiene el valor de :" + cadenaEvaluar);
        }
    }

}
