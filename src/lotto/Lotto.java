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

        int count = checkMatches(lottoNumbers, userNumbers);

        System.out.println("\nTrafiłeś " + count + " liczb. ");
        System.out.println(count < 3 ? "Nic nie wygrałeś..." : "Coś wygrałeś!");
    }

    public static int checkMatches(int[] lottoNumbers, int[] userNumbers) {
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

// My idea is to use swap for the first six elements in the array. Bonus: it works faster than collections.
// Important:
// that's right if the array will be sorted or if the order does not matter!
// otherwise, the first element will never be "1" , [2] != 2 and etc..

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
            arr[i] = getInputNumber("Liczba " + (i + 1) + ": ");
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

    public static int getInputNumber(String msg) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print(msg);
            while (!sc.hasNextInt()) {
                System.out.print("To nie jest liczba!\n"+msg);
                sc.nextLine();
            }
            num = sc.nextInt();
            if ((num < min) || (num > max)) {
                System.out.print("Liczba poza zakresem!\n");
            } else {
                break;
            }
        } while (true);
        return num;
    }
}