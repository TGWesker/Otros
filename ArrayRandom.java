/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrandom;

import java.util.Random;

/**
 *
 * @author jaespinal
 */
public class ArrayRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] Nombres = { "Carlos", "Jose", "Gustavo", "Antonio", "Alicia", "Rosario", "Javier", "Joaquin", "Francisco", "Andrea" };
        String valor = null;
        
        Random ran = new Random();
        String[] arrayRan;
        arrayRan = new String[9];
            for (int i=0;i<=Nombres.length;i++)
            {
                Nombres[i] = ran.NextInt(0, 9);
                
            }
    }
    
}
