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
public class Cuadrilatero implements Poligono {
   @Override
   public double area(){
         Scanner lector= new Scanner(System.in);
        System.out.println("ingrese la base");
            double base= lector.nextDouble();
       
        System.out.println("ingrese la altura");
            double altura= lector.nextDouble();
            double area = base*altura;
            return area;
    }
   @Override
    public double perimetro(){
         Scanner lector= new Scanner(System.in);
        System.out.println("ingrese lado x");
            double x= lector.nextDouble();
       
        System.out.println("ingrese lado y ");
            double y= lector.nextDouble();
            double perimetro= (2*x)+(2*y);
            return perimetro;
    }
    
}
