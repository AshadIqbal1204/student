//	05) 	wap to print only even numbers from an array
package Array;

public class PrintEvenArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("even arrays");
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
