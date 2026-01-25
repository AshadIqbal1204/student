//	07) 	wap to print only negative number from an array
package Array;

public class ArrayProgram07 {
    public static void main(String[] args) {
        int arr[]={1,-3,6,-5,4,-7,8,-2,6,9,-6};
        for (int i=0;i<= arr.length;i++){
            if (arr[i]<0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
