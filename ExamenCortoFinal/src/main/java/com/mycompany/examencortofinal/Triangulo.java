/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examencortofinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public abstract class Triangulo implements Poligono {
    @Override
    public double area(){
        Scanner lector= new Scanner(System.in);
        System.out.println("ingrese la base");
            double base= lector.nextDouble();
       
        System.out.println("ingrese la altura");
            double altura= lector.nextDouble();
            
          double areaTriangulo= (1/2*(base*altura));
      return areaTriangulo;
    }


   
};
