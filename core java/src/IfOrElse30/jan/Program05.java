//	5.	wap to find whether a number is divisible by a given number completely.
package IfOrElse30.jan;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1= sc.nextInt();
        System.out.println("Enter the number to divide ");
        int num2= sc.nextInt();
        if (num1%num2==0){
            System.out.println("is divisible");
        }
        else
            System.out.println("is not divisible");
    }

}
