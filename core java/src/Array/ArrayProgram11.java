//	11) 	wap to copy one array into other array
package Array;

public class ArrayProgram11 {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5,6,7,8,9};
        int arr2[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr2[i] =arr[i];
        }
        System.out.println("element in first array");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("element in second array");
        for (int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }
    }
}
