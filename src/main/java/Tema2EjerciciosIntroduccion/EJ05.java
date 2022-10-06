package operadoresbooleanos;

public class EJ05 {
    
    public static void main(String[] args) {
        
        //Declaramos variables
        boolean verdadero = true;
        boolean falso = false;
        
        //Hacemos un text block con todas las variables
        String Resultados ="""
                           verdadero && verdadero es:   %b
                           verdadero && falso es:       %b
                           falso && verdadero es:       %b
                           falso && falso es:           %b
                           verdadero || verdadero es:   %b
                           verdadero || falso es:       %b
                           falso || verdadero es:       %b
                           falso || falso es:           %b
                           """.formatted(verdadero&&verdadero, verdadero&&falso, falso&&verdadero, 
                                   falso&&falso, verdadero||verdadero, verdadero||falso, falso||verdadero, falso||falso);
        
        //Imprimo por pantalla todos los resultados 
        System.out.println(Resultados);
        System.out.println("!verdadero: " + !verdadero);
        System.out.println("!falso: " + !verdadero);
        
        
    }
    
}