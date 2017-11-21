/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examencortofinal;

/**
 *
 * @author diego
 */
public class main {
    public static void main(String[]args){
        String palabra = "auto";
        CifradoCesar intento= new CifradoCesar();
        palabra= intento.cifrarCesar(palabra, 0);
        System.out.println(palabra);
        
       
    }
    
    
}
