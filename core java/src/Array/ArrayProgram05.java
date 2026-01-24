//	05) 	wap to print only even numbers from an array
package Array;

public class ArrayProgram05 {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,1,6,7,9,3,2,8};
        System.out.println("Even Number From An Array");
        for (int i=0;i<= arr.length;i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
