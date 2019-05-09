/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dovle
 */
public class DogGenetics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String breed1 = "St. Bernard";
        String breed2 = "Chihuahua";
        String breed3 = "Dramatic RedNosed Asian Pug";
        String breed4 = "Common Cur";
        String breed5 = "King Doberman";
        int sum = 0;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        while (sum!=100) {
          number1 = rand.nextInt(100) + 1;
          number2 = rand.nextInt(100) + 1;
          number3 = rand.nextInt(100) + 1;
          number4 = rand.nextInt(100) + 1;
          number5 = rand.nextInt(100) + 1;
          sum = number1 + number2 + number3 + number4 + number5;
        }
        
        /* Alternative and more memory-efficient method of generating random numbers
        int number1 = rand.nextInt(100) + 1;
        int number2 = rand.nextInt(100 - number1) + 1;
        int number3 = rand.nextInt(100 - (number1 + number2)) + 1;
        int number4 = rand.nextInt(100 - (number1 + number2 + number3)) + 1;
        int number5 = 100 - (number1 + number2 + number3 + number4);
        */
        
        System.out.print("What is your dog's name? ");
        String dogName = sc.next();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.\n\n" + dogName + " is:\n");
        System.out.println(number1 + "% " + breed1);
        System.out.println(number2 + "% " + breed2);
        System.out.println(number3 + "% " + breed3);
        System.out.println(number4 + "% " + breed4);
        System.out.println(number5 + "% " + breed5);
        System.out.println("\nWow, that's QUITE the dog");
    }
    
}
