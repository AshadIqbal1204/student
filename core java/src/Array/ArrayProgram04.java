//	04) 	wap to print only odd numbers from an array
package Array;

public class ArrayProgram04 {
    public static void main(String[] args) {
        int arr[]={3,2,5,1,6,7,6};
        System.out.println("Only Odd Number From An Array");
        for (int i=0;i<= arr.length;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
