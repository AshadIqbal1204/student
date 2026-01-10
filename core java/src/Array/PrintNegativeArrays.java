//	07) 	wap to print only negative number from an array
package Array;

public class PrintNegativeArrays {
    public static void main(String[] args) {
        int arr[] = {-23, -45, 45, 67, -87, -26};
        System.out.println("negative arrays");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
