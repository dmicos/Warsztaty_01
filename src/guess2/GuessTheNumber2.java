package guess2;

import java.util.Scanner;

public class GuessTheNumber2 {

    public static void main(String[] args) {
        boolean win = false;
        int min = 0;
        int max = 1001;
        int count = 0;

        while (count++ < 10 && !win) {
            int guess = getGuess(min, max);
            switch (getAnswer(guess)) {
                case "1":
                    min = guess;
                    break;
                case "2":
                    max = guess;
                    break;
                case "3":
                    win = true;
                    System.out.println("\n==> Trafiłem w " + count + " ruchach");
                    break;
            }
        }
        if (!win) {
            System.out.println("Jesteś oszustem!");
        }
    }

    public static int getGuess(int min, int max) {
        return (min + (max - min) / 2);
    }

    public static String getAnswer(int guess) {
        Scanner sc = new Scanner(System.in);
        System.out.print("----\nCzy ta liczba to: " + guess + "?\n" +
                "\t[1]-Więcej\n" +
                "\t[2]-Mniej\n" +
                "\t[3]-Trafiłeś\n" +
                "Pobierz odpowiedz [1-3]: "
        );
        while (!sc.hasNext("[123]")) {
            System.out.print("Pobierz odpowiedz [1-3]: ");
            sc.nextLine();
        }
        return sc.nextLine();
    }

}