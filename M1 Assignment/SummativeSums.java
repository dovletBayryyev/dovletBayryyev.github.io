/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summativesums;

/**
 *
 * @author dovle
 */
public class SummativeSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int [] array2 = {999, -60, -77, 14, 160, 301};
        int [] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        
        /*
        int sumOfArray1 = 0;
        for(int i = 0; i < array1.length; i++) {
          sumOfArray1 += array1[i];
        }
        System.out.println(sumOfArray1);
        */
        int sumOfArray1 = arraySum(array1);
        int sumOfArray2 = arraySum(array2);
        int sumOfArray3 = arraySum(array3);
        System.out.println("#1 Array Sum: " + sumOfArray1);
        System.out.println("#2 Array Sum: " + sumOfArray2);
        System.out.println("#3 Array Sum: " + sumOfArray3);
        }
      public static int arraySum (int [] array) {
        int sumOfArray = 0;
        for(int i = 0; i < array.length; i++) {
          sumOfArray += array[i];
        }
          return sumOfArray;
    }
}
   
