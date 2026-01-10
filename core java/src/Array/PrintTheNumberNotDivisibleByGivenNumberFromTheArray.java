//	09) 	wap to print number not divisible by given number from an array
package Array;

public class PrintTheNumberNotDivisibleByGivenNumberFromTheArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Not divisible by 2");
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
