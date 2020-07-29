package Lab2;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name ?:");
        String name = scanner.nextLine();
        System.out.println("Your name is "+name);

        System.out.print("Enter your old ?:");
        int old = scanner.nextInt();
        System.out.println("Enter your old "+ old);

        System.out.print("Enter your nick name ?:");
        String nickname = scanner.nextLine();
        System.out.println("Your nick name is "+nickname);






    }
}
