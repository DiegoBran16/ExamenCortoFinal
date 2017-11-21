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
public class TrianguloEscaleno  extends Triangulo {

    @Override
    public double perimetro() {
                Scanner lector= new Scanner(System.in);
        System.out.println("ingrese el lado a");
            double a= lector.nextDouble();
              
        System.out.println("ingrese el lado b");
            double b= lector.nextDouble();
                System.out.println("ingrese el lado c");
            double c= lector.nextDouble();
            double per=a+b+c;
            return per;
    }
    
}
