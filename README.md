ExamenCortoFinal
=========================
+Para la elaboracion del cifrado cesar utilice dos arreglos, uno con las letras del alfabeto en mayusculas y otro con las minusculas, por lo cual obtendra la letra de la posicion solicitada de la frase y posteriormente la buscara en los arreglos hasta encontrarla y sustituirla por la letraubicada 3 posiciones despues, en la opcion de agregar el alfabero obtendra un string el cual posteriomente se convertira en un arreglo y se repetira el proceso anterior pero con el nuevo arreglo
~~~
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
~~~
+ Posteriormente se solicito crear clases para una serie de figuras untilizando la interfaz poligono por lo cual fue unicamente necesario implementar la interfaz en las clasese agregando los metodos correspondientes, la excepcion fue con la clase triangulo la cual es abstracta ya que todos los triangulos poseen la misma formula de area pero no el perimetro por lo cual el metodo abstracto fue el perimetro. Para la elaboracion de las siguientes clases de triangulo se heredo de la clase abstracta triangulo y se implemento el metodo perimetro

+interfaz
~~~
public interface Poligono {
    double area();
    double perimetro();
    
}
~~~
+ ejemplos de la interfaz implementada 
~~~
public class Octagono implements Poligono{
    
      @Override
    public double area(){
          Scanner lector= new Scanner(System.in);
        System.out.println("ingrese la longitud de los lados");
           double L = lector.nextDouble();
           System.out.println("ingrese la longitud de la apotema");
           double ap = lector.nextDouble();
           double area=(4*L*ap);
           return area;
           
    }
    @Override
    public double perimetro(){
          Scanner lector= new Scanner(System.in);
        System.out.println("ingrese la longitud de los lados");
           double L = lector.nextDouble();
           double per = 8*L;
           return per;
        
        
    }
    
}


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
~~~
+ clase abstracta triangulo
~~~
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
~~~
+ implementaciones de triangulos con la clase abstracta
~~~

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





