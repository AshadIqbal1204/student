//	11) 	wap to copy one array into other array
package Array;

public class CopyArrayIntoOtherArray {
    public static void main(String[] args) {
        int arr[]={4,5,3,6,2,7,1};
        int arr2[]=new int[arr.length];
        for (int i=0;i< arr.length;i++) {
            arr2[i] = arr[i];
        }
            System.out.println("element in first array");
            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i]+" ");
        }
        System.out.println("elements in second array");
            for (int i=0;i< arr2.length;i++){
                System.out.println(arr2[i]+" ");
            }
    }
}
