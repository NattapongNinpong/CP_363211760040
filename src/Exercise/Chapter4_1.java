package Exercise;

import sun.plugin2.message.JavaScriptGetWindowMessage;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
        System.out.print("num2: ");
        int num2 = scanner.nextInt();
        System.out.print("num3: ");
        int num3 = scanner.nextInt();
        System.out.print("num4: ");
        int num4 = scanner.nextInt();
        System.out.print("num5: ");
        int num5 = scanner.nextInt();
        System.out.print("num6: ");
        int num6 = scanner.nextInt();
        System.out.print("num7: ");
        int num7 = scanner.nextInt();
        System.out.print("num8: ");
        int num8 = scanner.nextInt();
        System.out.print("num9: ");
        int num9 = scanner.nextInt();
        System.out.print("num10: ");
        int num10 = scanner.nextInt();

        int toal =num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        int avg = toal / 10;

        System.out.println("Total : "+toal);
        System.out.println("Average : "+avg);

    }
}
