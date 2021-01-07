package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        int gameCount = 0;
        int pcWins = 0;
        int userWins = 0;
        int tie = 0;

        int userRock = 0;
        int userPaper = 0;
        int userScissors = 0;

        int pcRock = 0;
        int pcPaper = 0;
        int pcScissors = 0;

        int userChoice = 5;
        while (userChoice != 0) {
            do {
                System.out.println("Please enter one of the following numbers:");
                System.out.println("1 = Rock");
                System.out.println("2 = Paper");
                System.out.println("3 = Scissors");
                System.out.println("0 = End of Game");
                Scanner sc = new Scanner(System.in);
                userChoice = sc.nextInt();
            } while (userChoice < 0 || userChoice > 3);
            int pcChoice = (int) (Math.random() * 3) + 1;
            if (userChoice == 0) {
                if (gameCount == 0) {
                    System.out.println("No games were played");
                } else if (userWins > pcWins) {
                    System.out.println("End of game. You've won! You have " + userWins + " wins and PC has " + pcWins + " wins."
                            + " Out of " + gameCount + " rounds you won " + (userWins * 100) / gameCount + "% of time. You picked Rock: " + userRock + " times (" + (userRock * 100) / gameCount + "%), "
                            + "Paper: " + userPaper + " times (" + (userPaper * 100) / gameCount + "%) and Scisors: " + userScissors + " times (" + (userScissors * 100) / gameCount + "%). Congratulations!");
                } else if (userWins < pcWins) {
                    System.out.println("End of game. You've lost! You have only " + userWins + " wins and PC has " + pcWins + " wins."
                            + " Out of " + gameCount + " rounds you lost " + (pcWins * 100) / gameCount + "% of time. You picked Rock: " + userRock + " times (" + (userRock * 100) / gameCount + "%), "
                            + "Paper: " + userPaper + " times (" + (userPaper * 100) / gameCount + "%) and Scisors: " + userScissors + " times (" + (userScissors * 100) / gameCount + "%). Better luck lext time");
                } else {
                    System.out.println("It's a tie! You have " + userWins + " wins and PC has " + pcWins + " wins. You picked Rock: " + userRock + " times (" + (userRock * 100) / gameCount + "%), "
                            + "Paper: " + userPaper + " times (" + (userPaper * 100) / gameCount + "%) and Scisors: " + userScissors + " times (" + (userScissors * 100) / gameCount + "%). Keep trying!");
                }
            } else {
                gameCount++;
                if (userChoice == 1) {
                    userRock++;
                    if (pcChoice == 1) {
                        pcRock++;
                        tie++;
                        System.out.println("Rock vs Rock. It's a tie, try again.");
                    } else if (pcChoice == 2) {
                        pcPaper++;
                        pcWins++;
                        System.out.println("Paper covers Rock. You've lost, try again.");
                    } else {
                        pcScissors++;
                        userWins++;
                        System.out.println("Rock breaks scissors. You've won, but try again.");
                    }
                } else if (userChoice == 2) {
                    userPaper++;
                    if (pcChoice == 2) {
                        pcPaper++;
                        tie++;
                        System.out.println("Paper vs Paper. It's a tie , try again.");
                    } else if (pcChoice == 1) {
                        pcRock++;
                        userWins++;
                        System.out.println("Paper covers Rock. You've won, but try again.");
                    } else {
                        pcScissors++;
                        pcWins++;
                        System.out.println("Scissors cuts Paper. You've lost, try again.");
                    }
                } else {
                    userScissors++;
                    if (pcChoice == 3) {
                        pcScissors++;
                        tie++;
                        System.out.println("Scissors vs Scissors. It's a tie , try again.");
                    } else if (pcChoice == 2) {
                        pcPaper++;
                        userWins++;
                        System.out.println("Scissors cuts Paper. You've won, but try again.");
                    } else {
                        pcRock++;
                        pcWins++;
                        System.out.println("Rock breaks Scissors. You've lost, try again.");
                    }
                }
            }
        }
    }
}
