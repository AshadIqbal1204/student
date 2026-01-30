//	4.	wap to find a number is negative or positive or zero
package IfOrElse30.jan;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num1= sc.nextInt();
        if (num1>0){
            System.out.println(" is positive");
        }
        else if (num1<0){
            System.out.println(" is negative");
        }
        else
            System.out.println(" is zero");
    }
}
