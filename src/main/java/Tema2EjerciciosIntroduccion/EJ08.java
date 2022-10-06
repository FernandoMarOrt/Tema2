package Tema2EjerciciosIntroduccion;

import java.util.Scanner;


public class EJ08 {
    
    public static void main(String[] args) {
        
        //Declaro las variables 
        int tiempo;
        int horas , minutos , segundos;
        
        Scanner teclado = new Scanner(System.in);
        //Pido por teclado el valor de la variable tiempo
        System.out.println("Dime un valor en segundos");
        tiempo = teclado.nextInt();
        
        horas = tiempo/3600; //Calculo las horas
        minutos = (tiempo-(3600*horas))/60; //Calculo los minutos 
        segundos = tiempo-((horas*3600)+(minutos*60)); //Calculo los segundos
        
        //Imprimo el resultado por pantalla
        System.out.println("Horas: " + horas + " Minutos: " + minutos + " Segundos: " + segundos);
    }
    
}
