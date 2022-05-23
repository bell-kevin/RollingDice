package rollingdice;

import java.util.Scanner;

public class RollingDice {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        int die1, die2, total;
        String value;
        System.out.println("Can you roll doubles?");    
        do {
            System.out.print("Press enter to roll the dice:");
            computerKeyboardInput.nextLine();
            die1 = rollDie();
            die2 = rollDie();
            total = evenOdd(die1, die2);
            printResult(die1, die2, total);
            System.out.print("Do you want to play again? (y/n) ");
            value = computerKeyboardInput.nextLine();
        } while ("y".equals(value) || "Y".equals(value));
    }

    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void printResult(int die1, int die2, int total) {
        if (die1 == die2) {
            System.out.printf("You rolled two %d's.\n", die1);
            if (total % 2 == 0 && total > 0) {
                System.out.printf("The total is the even number %d \n", total);
            } else {
                System.out.printf("The total is the odd number %d \n", total);
            }
        } else {
            System.out.printf("You rolled a %d and a %d.\n", die1, die2);
            if (total % 2 == 0 && total > 0) {
                System.out.printf("The total is the even number %d \n", total);
            } else {
                System.out.printf("The total is the odd number %d \n", total);
            }
        }
    }

    public static int evenOdd(int die1, int die2) {
        int total = die1 + die2;
        return total;
    }
}
