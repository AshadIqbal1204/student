//	3.	wap to find a number is odd or even
package IfOrElse30.jan;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num1= sc.nextInt();

        if (num1%2==0) {
            System.out.println(num1 + " is even");
        }
        else
            System.out.println(num1+" is odd");

    }
}
