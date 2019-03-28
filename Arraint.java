/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraint;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author jaespinal
 */
public class Arraint {

    /**
     * @param args the command line arguments
     */
    
     /*
        Interfaz
        
        Proceso que realiza: Genera un array con los elementos primos del array anterior
        
        Precondiciones: Ninguna
        
        Entradas: Array generado anteriormente (?)
        
        Salidas: Array con elementos primos anteriores
        
        Postcondiciones:Los elementos deben ser primos
        */
    
    private static boolean esPrimo(int num){
        boolean primo = (num==1)?false:true;
        int divisor=2;
        while(primo && divisor<num/2){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int x;
        
        /* 
        INTERFAZ:
        
        Proceso que realiza: genera un array de numeros aleatorios y los muestra por pantalla
        
        Precondiciones: Ninguna
        
        Entradas: Ninguna
        
        Salidas: Array generado con numeros aleatorios
        
        Postcondiciones: Ningnuna
        */
        
        for(int i=0; i<numeros.length; i++)
        {
            Random rando = new Random();
            x = (int)(rando.nextDouble() * 10.0); 
            numeros[i] = x;
        }
        
        System.out.println(Arrays.toString(numeros));
        
    }
    
    
}
