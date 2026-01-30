//1.	wap to find which number is greater among two numbers
package IfOrElse30.jan;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num1= sc.nextByte();
        System.out.println("Enter the 2nd number");
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println(num1+" is greater");
        }
        else
            System.out.println(num2+" is greater");
    }
}