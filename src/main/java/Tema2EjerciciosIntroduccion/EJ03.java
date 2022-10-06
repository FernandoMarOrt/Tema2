package Tema2EjerciciosIntroduccion;

public class EJ03 {

    public static void main(String[] args) {

        //Apartado a
        int a = 10, b = 5, i = 0;

        //Apartado b
        double c = 71.3, d = 4.8, f = 6.9;

        //Creamos variables para almacenar los resultados de las operaciones
        int sumaAYB, restaAYB, multiplicacionAYB , divisionAYB;

        double  sumaCYD, restaCYD, multiplicacionCYD, divisionCYD;
        
        //Apartado c

        sumaAYB = a + b;
        restaAYB = a - b;
        multiplicacionAYB = a * b;
        divisionAYB = a / b;
        sumaCYD = c + d;
        restaCYD = c - d;
        multiplicacionCYD = c * d;
        divisionCYD = c / d;
        
        //Si quiero decimales dividiendo dos int tengo que forzar
        //que uno de los operadores sea double o float
        
        //divisionAYB = a/(double)b;
        
       
        //Apartado d
        //El %f saca solo los decimales que quieres es decir si pones %.3f sacara solo 3 decimales
        // la letra f varia segun el tipo de variable por ejemplo esta es para double
        
        System.out.printf("Suma %.3f Resta %.4f Multiplicacion %.2f Division %.1f", sumaCYD, restaCYD,
                multiplicacionCYD, divisionCYD);
        
        System.out.println("");
        //TEXT BLOCK:
        String resultado = """
                           Suma             %d
                           Resta            %d
                           Multiplicacion   %d
                           Division         %d
                           """.formatted(sumaAYB, restaAYB, multiplicacionAYB, divisionAYB);
        
        System.out.println(resultado);
        
        //Apartado e
        
        int operacion1,operacion2;
        double operacion3;
        
        operacion1 = a*=3;
        operacion2 = b-=1;
        operacion3 = c+=d;
        
        System.out.println("El resultado de a*=3 es " + operacion1);
        System.out.println("El resultado de b-=1 es " + operacion2);
        System.out.println("El resultado de c+=d es " + operacion3);
        
        
        //Apartado f
        
        System.out.println("el valor de i es: " + i);
        System.out.println("el valor de i++ es: " + i++);
        System.out.println("el valor de i denuevo es: " + i);
        System.out.println("el valor de ++i es: " + ++i);
        
       //Modulo
       a = 11;
       b = 5;
       
       int cociente = a/b;
       int resto = a%b; // El % da el resto de la operacion es decir 11/5 daria 1
       
       System.out.println("Cociente " + cociente + " Resto " + resto);
    }

}