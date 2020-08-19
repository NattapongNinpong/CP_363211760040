package Lab3;

import java.util.Scanner;

public class Example_For2 {
    public static void main(String[] args) {
        //รับค่าจำนวนเต็ม 10 ครั้งจากผู้ใช้ แสดง ผลรวม และค่าเฉลี่ย ทางจอภาพ (for)
        Scanner sc = new Scanner(System.in);
        int total= 0;

        for (int i = 0; i <=10 ; i++) {
            System.out.print("Enter integers: ");
            int num = sc.nextInt();
            total += num; //ผลรวมเก็บใน total
        }
        //display
        System.out.println("Totel: " + total);
        System.out.println("Average: " + total/10);

    }
}
