/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examencortofinal;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class TrianguloIsoceles extends Triangulo {

    @Override
    public double perimetro() {
         Scanner lector= new Scanner(System.in);
        System.out.println("ingrese el tamaño de los lados a");
            double a= lector.nextDouble();
              
        System.out.println("ingrese el lado  b");
            double b= lector.nextDouble();
            
            double per = (2*a)+b;
            return per;
       
    }
    
}
