//	12) 	wap to copy an array to another array in reverse order
package Array;

public class CopyTheArrayToAnotherArrayInReverseOrder {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 8, 7, 6, 9, 1, 3};
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("element in first array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("elements in array 2 in reverse order");
        for (int i=8;i< arr.length;i--){
            System.out.println(arr2[i]+" ");
        }
    }
}