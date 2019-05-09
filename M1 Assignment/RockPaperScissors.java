/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dovle
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int ties = 0;
        int userWins = 0;
        int computerWins = 0;
        boolean wantToPlay = true;
        while (wantToPlay == true) {
            System.out.println("Choose the number of rounds (1-10)");
            int numberOfRounds = sc.nextInt();
            if (numberOfRounds < 1 || numberOfRounds > 10) {
                System.out.println("ERROR");
                break;
            }
            else {
                for (int i = 1; i <= numberOfRounds; i++) {
                    System.out.println("Round " + i + ". Choose your element (1 = Rock, 2 = Paper, 3 = Scissors)");
                    int userElement = sc.nextInt();
                    Random rand = new Random(); 
                    int computerElement = rand.nextInt(3) + 1;
                    if (userElement == computerElement) {
                        System.out.println("User choice: " + userElement + " vs Computer choice: " + computerElement + ". It's a tie!");
                        ties++;
                    }
                    else if (userElement == 2 && computerElement == 1) {
                        System.out.println("User choice: " + userElement + " vs Computer choice: " + computerElement + ". User wins!");
                        userWins++;
                    }
                    else if (userElement == 3 && computerElement == 2){
                        System.out.println("User choice: " + userElement + " vs Computer choice: " + computerElement + ". User wins!");
                        userWins++;
                    } 
                    else if (userElement == 1 && computerElement == 3) {
                        System.out.println("User choice: " + userElement + " vs Computer choice: " + computerElement + ". User wins!");
                        userWins++;
                    }
                    else {
                           System.out.println("User choice: " + userElement + " vs Computer choice: " + computerElement + ". The computer wins!"); 
                           computerWins++;
                           }
            }
            System.out.println("SUMMARY: Ties - " + ties + ". User Wins - " + userWins + ". Computer Wins: " + computerWins + ".");
            if(userWins > computerWins) {
                System.out.println("User won the game!");
            }
            else if(computerWins > userWins) {
                System.out.println("Computer won the game!");
            }
            else {
                System.out.println("The game ended in a tie!");
            }
            System.out.println("Would you like to play again? (y/n)");
            String playAgain = sc.next();
            if ("n".equals(playAgain)) {
                System.out.println("Thanks for playing!");
                wantToPlay = false;
            }
        }
    }
  }
}
