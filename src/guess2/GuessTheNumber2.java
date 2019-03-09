package guess2;

import java.util.Scanner;

public class GuessTheNumber2 {

    public static void main(String[] args) {
        int min = 0;
        int max = 1001;
        int count = 0;

        while (count <= 10) {
            count++;
            int guess = getGuess(min, max);
            System.out.println("Czy ta liczba to: " + guess + "?");
            int answer = getAnswer();
            if (answer == 1) {
                min = guess;
            } else if (answer == 2) {
                max = guess;
            } else if (answer == 3) {
                System.out.println("Trafiłem w " + count + " ruchach");
                break;
            } else {
                System.out.println("--- Nie oszukuj! ---");
                count--;
            }
            System.out.println("-----------------");
        }
        if (count > 10) {
            System.out.println("Jesteś oszustem");
        }
    }

    public static int getGuess(int min, int max) {
        return (int) (min + (max - min) / 2);
    }

    public static int getAnswer() {
        System.out.print(
                "[1] więcej\n" +
                        "[2] mniej\n" +
                        "[3] trafiłeś\n" +
                        "Pobierz odpowiedz [1-3]: "
        );

        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Pobierz odpowiedz [1-3]: ");
            sc.nextLine();
        }

        return sc.nextInt();
    }

}