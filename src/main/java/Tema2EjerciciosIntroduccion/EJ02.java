package Tema2EjerciciosIntroduccion;

public class EJ02 {

    public static void main(String[] args) {
        
        int a=1, b=2, c=3;
        double d=4.5, e=5.7, f=6.9;
        
        System.out.println("Variables tipo entero: variable a: " + a + " variable b: " + b + 
                " variable c: " + c);
        System.out.println("Variables tipo double variable d: " + d + " variable e: " + e +
                " variable f: " + f);
       
       //Apartado D 
        
       int auxiliar = b; //Creo y declaro la variable auxiliar para ayudarme a pasar los numeros
       b = c;
       c = a;
       a = auxiliar;
       
       System.out.println("Variables intercambiadas variable a: " + a + " variable b: " + b + 
               " variable c: " + c);
       
       
    }
}