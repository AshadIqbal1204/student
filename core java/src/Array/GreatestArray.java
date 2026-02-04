//	14) 	wap to find greatest number from any array
package Array;

public class GreatestArray {
    public static void main(String[] args) {
        int arr[]={2,1,3,6,4,8,5,9};
        int greatest=0;
        for (int i=1;i< arr.length;i++){
            if (arr[i]>greatest){
                greatest=arr[i];
            }
        }
        System.out.println("greatest array="+greatest);
    }
}
