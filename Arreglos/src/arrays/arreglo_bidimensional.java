/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author OMI
 */
public class arreglo_bidimensional {
    
    public static void main(String[] args) {
        
        int[][] arregloEntero2 = new int[10][10];
        int n = 1;
        
       for(int i = 0; i < 10; i++){
           for(int j = 0; j < 10; j++){
              
               arregloEntero2[i][j] = n;
               n++;
               
               if(j == 9){
                   for(i = 1; i < 9; i++){
                       arregloEntero2[i][9] = n;
                       n++;
                   }
                }
            }
       }
       
       
       for(int i = 0; i < 10; i++){
           for(int j = 0; j < 10; j++){
               System.out.print("\t" + arregloEntero2[i][j]);
           }
           System.out.println("");
       }
    }
}
