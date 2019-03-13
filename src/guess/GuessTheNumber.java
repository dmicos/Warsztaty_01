package guess;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int numUser;
        int numGuess = randomNumber(1, 100);
        while ((numUser = getUserNumber()) != numGuess) {
            System.out.print(numUser < numGuess ? "Za mało! " : "Za duzo! ");
        }
        System.out.println("Zgadłeś");
    }

    public static int getUserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zgadnij liczbę: ");
        while (!sc.hasNextInt()) {
            System.out.print("To nie jest liczba. Zgadnij liczbę: ");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public static int randomNumber(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
}
