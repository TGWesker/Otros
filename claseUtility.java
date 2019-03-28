/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprimos;

import java.util.Random;

/**
 *
 * @author jaespinal
 */
public class claseUtility {
     /* 
    INTERFAZ:
    
    Proceso que realiza: Genera un array a partir de un array dado de numeros enteros 
    donde se almacenan sus elementos primos
    
    Precondiciones: Ninguna
    
    Entradas: Ninguna
    
    Salidas: array de numeros primos
    
    Postcondiciones: Los numeros del array deben ser los numeros primos del array anterior
    */

    public int[] primosArray(){
        int[] arrayPrim = new int[10];
        int x;
        
        for(int i=0; i<arrayPrim.length; i++)
        {
            Random rando = new Random();
            x = (int)(rando.nextDouble() * 20.0)+1;
            arrayPrim[i] = x;
            
        }
        
        return arrayPrim;
        
    }
    public boolean siesPrimo(int num){
        boolean primo = (num==1)? false:true;
        int divisor = 2;
        while(primo && divisor<num/2){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
}

