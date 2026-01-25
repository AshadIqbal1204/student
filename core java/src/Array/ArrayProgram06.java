//	06) 	wap to print only positive number from an array
package Array;

public class ArrayProgram06 {
    public static void main(String[] args) {
        int arr[]={-2,4,3,-6,-1,8,-7,9,8,-1};
        for (int i=0;i<= arr.length;i++){
            if (arr[i]>0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
