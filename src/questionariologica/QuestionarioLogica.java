/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionariologica;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class QuestionarioLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double raio, perimetro, area, diametro;
        
        System.out.println("Informe o raio do círculo:");
        raio = teclado.nextDouble();
        
        perimetro = Math.PI*2*raio;
        area = Math.PI*Math.pow(raio, 2);
        diametro = 2*raio;
        
        System.out.println("O perímetro do círculo é igual a "+perimetro);
        System.out.println("A área do círculo é igual a "+area);
        System.out.println("O diâmetro do círculo é igual a "+diametro);
        
    }
    
}
