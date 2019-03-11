package dice;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class Dice {

    public static void main(String[] args) {
        printInfo();
        String[] dice = getDiceStr().split("D");
        int repeat = getRepeat(dice[0]);
        int[] value = getValue(dice[1]);
        printThrows(repeat, value[0], value[1]);
    }

    // Get & Check input format
    public static String getDiceStr() {
        System.out.print("Throw : ");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d*D(3|4|6|8|10|12|20|100)([-+](\\d+))?");
        while (!scanner.hasNext(pattern)) {
            System.out.print("Wrong format! Repeat throw: ");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static int getRepeat(String x) {
        return (x.isEmpty() ? 1 : Integer.parseInt(x));
    }

    public static int[] getValue(String yz) {
        int index;
        int y, z = 0;
        if (((index = yz.indexOf("+")) < 0)
                && ((index = yz.indexOf("-")) < 0)
        ) {
            y = Integer.parseInt(yz);
        } else {
            y = Integer.parseInt(yz.substring(0, index));
            z = Integer.parseInt(yz.substring(index));
        }
        return new int[]{y, z};
    }

    public static void printThrows(int repeat, int y, int z) {
        int sum = z;
        StringJoiner result = new StringJoiner(" + ");
        for (int i = 0; i < repeat; i++) {
            int num = 1 + (int) (Math.random() * y);
            result.add("" + num);
            sum += num;
        }
        if (z != 0) {
            result.add("(" + z + ")");
        }

        System.out.format("Result of the throw: %s = %s", result.toString(), sum);
    }

    public static void printInfo() {
        System.out.println(
                "****************************(  KOSTKA DO GRY  )*****************************\n" +
                "*  Kod takiej kostki wygląda następująco: xDy + z                          *\n" +
                "*  Typy kostek występujące w grach: D3, D4, D6, D8, D10, D12, D20, D100.   *\n" +
                "*  Przykłady: 2D10+10, D6, 2D3, D12-1                                      *\n" +
                "****************************************************************************"
        );
    }
}
