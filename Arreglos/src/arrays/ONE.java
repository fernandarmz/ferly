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
public class ONE{
    
    public static void main(String[] args) {
        
       /* int arregloEntero[] = {1, 2, 3, 4, 5};
        System.out.println(arregloEntero[0]);
        System.out.println(arregloEntero[3]);
        
        int[] arregloEntero = new int[5];
        arregloEntero[0] = 5;
        arregloEntero[1] = 10;
        arregloEntero[2] = 15;
        arregloEntero[3] = 20;
        arregloEntero[4] = 25;
        */
       
//       int[] arregloEntero = new int[5];
//       int[] arregloEntero1 = new int[20];
       int[][] arregloEntero2 = new int[10][10];
       int n = 1;
       
       for(int i = 0; i < 10; i++){
           for(int j = 0; j < 10; j++){
              
              arregloEntero2[i][j] = n;
              n++;
           }
       }
       
       for(int i = 0; i < 10; i++){
           for(int j = 0; j < 10; j++){
               System.out.print("\t" + arregloEntero2[i][j]);
           }
           System.out.println("");
       }
       
//       System.out.println("Posiciones impares: ");
//       
//       for(int i = 0; i < 5; i++){
//           
//           arregloEntero[i] = i;
//           
//           if(i % 2 != 0){
//              
//                System.out.println(arregloEntero[i]);
//           }
//       }
//       
//        System.out.println("Terminó el for.");
//        
//        
//        
//        for(int i = 0; i < 20; i++){
//            
//            arregloEntero1[i] = i * 3;
//        }
//        
//        System.out.println("Multiplos de 3: ");
//        
//        for(int i = 0; i < 20; i++){
//              
//                System.out.println(arregloEntero1[i]);
//        }  
//        
//        System.out.println("Números Impares: ");
//        
//        for(int i = 0; i < 20; i++){
//            
//            if(arregloEntero1[i] % 2 != 0){
//                System.out.println(arregloEntero1[i]);
//            }   
//        }
        
        
    }
}
