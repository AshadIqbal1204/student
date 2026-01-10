//	06) 	wap to print only positive number from an array
package Array;

public class PrintOnlyPositiveNumbers {
    public static void main(String[] args) {
        int arr[]={-54,56,12,-34,-69,65};
        System.out.println("Print positive number");
        for (int i=0;i< arr.length;i++){
            if (arr[i]>0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
