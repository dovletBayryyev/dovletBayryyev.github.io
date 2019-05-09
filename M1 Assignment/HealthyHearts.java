/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthyhearts;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author dovle
 */
public class HealthyHearts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = sc.nextInt();
        int maxRate = 220 - age;
        double targetRange1 = (maxRate * 0.50);
        double targetRange2 = (maxRate * 0.85);
        System.out.print("Your maximum heart rate should be " + maxRate + " beats per minute\nYour target HR Zone is " + Math.round(targetRange1) + " - " + Math.round(targetRange2) + " beats per minute.");
    }
    
}
