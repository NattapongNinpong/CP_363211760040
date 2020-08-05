package Exercise;

import java.lang.reflect.ParameterizedType;
import java.util.Scanner;

//1.รับค่า รัศมีวงกลม (r)
//2.หาพื้นที่วงกลม (PI * r)
//3.หาเส้นรอบวง (2 * PI * r)
//4.หาปริมาตรทรงกลม (4/3 * PI *r*r*r)
public class Chapter5_2 {
    public static  final  double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //รับค่ารัศมีวงกลม r
        System.out.print("ระบุรัศมีวงกลม (r): ");
        double r = scanner.nextDouble();

        //หาพื้นที่วงกลม
        double area = PI * r * r;
        System.out.println("พื้นที่วงกลม: "+area);

        //หาเส้นรอบวง
        double girth = 2* PI * r;
        System.out.println("เส้นรอบวง: "+girth);

        //หาปริมาตรทรงกลม
        double volume = (4/3) * PI * r * r * r;
        System.out.println("ปริมาตรทรงกลม: "+volume);


    }
}
