package lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

    public static final int length = 6;
    public static final int min = 1;
    public static final int max = 49;

    public static void main(String[] args) {

        int[] lottoNumbers = getLottoNumbers();
        int[] userNumbers = getUserNumbers();

        System.out.println("\nWylosowane liczby: " + Arrays.toString(lottoNumbers));
        System.out.println("Twoje liczby: " + Arrays.toString(userNumbers));

        int count = check(lottoNumbers, userNumbers);
        System.out.print("\nTrafiłeś " + count + " liczb. ");
        if (count < 3) {
            System.out.println("Nic nie wygrałeś...");
        } else {
            System.out.println("Coś wygrałeś!");
        }

    }

    public static int check(int[] lottoNumbers, int[] userNumbers) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (lottoNumbers[i] == userNumbers[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] getLottoNumbers() {

        int[] numbers = new int[max];
        for (int i = 0; i < max; i++) {
            numbers[i] = i + 1;
        }

        // Random swap for the first 6 elements in the array
        // Tested, the probability for all 49 numbers is the same,
        // Important: only valid if the array will be sorted! Otherwise, the first element will never be "1" etc..

        for (int i = 0; i < length; i++) {
            int k = (int) (Math.random() * (max - min)) + min;
            int t = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = t;
        }

        int[] res = Arrays.copyOf(numbers, 6);
        Arrays.sort(res);
        return res;
    }

    public static int[] getUserNumbers() {
        int[] arr = new int[length];
        int i = 0;
        while (i < length) {
            boolean flag = true;
            System.out.print("Liczba " + (i + 1) + " --> ");
            arr[i] = getInputNumber();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Już podałeś liczbę!");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                i++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int getInputNumber() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            while (!sc.hasNextInt()) {
                System.out.print("To nie jest liczba! Wpisz liczbę: ");
                sc.nextLine();
            }
            num = sc.nextInt();
            if ((num < 1) || (num > 49)) {
                System.out.print("Liczba poza zakresem! Wpisz liczbę: ");
            } else {
                break;
            }
        } while (true);
        return num;
    }
}