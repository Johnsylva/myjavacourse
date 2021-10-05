package chapter;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg []){
        //1.	Get the number of hours worked
        System.out.println("Get the number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2.	Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rates = scanner.nextDouble();
        scanner.close();

        //3.	Multiply hours and pay rate
        double grossPay = hours * rates;

        //4.	Display result
        System.out.println("The employee's grosspay is $" + grossPay);


    }
}
