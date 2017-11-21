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
public class CifradoCesar {
    String[] alfabetoMayus={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","y","Z"};
    String[] alfabetoMin={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
   
    public String cifrarCesar(String frase, int distancia){
        String letra="";
        String replace="";
        letra+=frase.charAt(distancia);
        for(int i=0; i < alfabetoMayus.length;i++){
           String lt1=alfabetoMayus[i];
           String lt2=alfabetoMin[i];
            if(lt1.equals(letra))
            {
                letra=alfabetoMayus[i+3];
              char old=frase.charAt(distancia);
              char newest = letra.charAt(0);
                replace=frase.replace(old, newest);
                frase=replace;
                break;
                
            }
             if(lt2.equals(letra))
            {
                  letra=alfabetoMin[i+3];
              char old=frase.charAt(distancia);
              char newest = letra.charAt(0);
                replace = frase.replace(old, newest);
               frase=replace;
                break;
                
            }
        }
        return frase;
    }
    public String cifrarCesar(String frase, int distancia, String alfabeto){
        int num= alfabeto.length();
        char[] arreglo=new char[num];
        for(int i =0; i<alfabeto.length();i++){
                arreglo[i]=alfabeto.charAt(i);  
      
        }
        char ltra=frase.charAt(distancia);
        for (int i =0; i<alfabeto.length();i++){
            if(ltra==arreglo[i]){
                char ltra2=arreglo[i+3];
               String change= frase.replace(ltra, ltra2);
               frase=change;
            }
        }
        return frase;
        
    }
    
           
        
    
};
    
    
    

