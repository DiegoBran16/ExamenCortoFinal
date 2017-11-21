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
public class Pentagono implements Poligono {
    @Override
    public double area(){
          Scanner lector= new Scanner(System.in);
        System.out.println("ingrese la longitud de los lados");
           double L = lector.nextDouble();
           System.out.println("ingrese la longitud de la apotema");
           double ap = lector.nextDouble();
           double area=(5*L*ap)/2;
           return area;
           
    }
    @Override
    public double perimetro(){
          Scanner lector= new Scanner(System.in);
        System.out.println("ingrese la longitud de los lados");
           double L = lector.nextDouble();
           double per = 5*L;
           return per;
        
        
    }
    
}
