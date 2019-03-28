/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprimos;

import java.util.Arrays;

/**
 *
 * @author jaespinal
 */
public class ArrayPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        claseUtility metodo = new claseUtility();
        int[] e;
        int[] x;
        
        e = metodo.primosArray();
        x = metodo.siesPrimo();
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(x));
    }
    
}
