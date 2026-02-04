//13) 	wap to find some of an array element
        package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={2,4,3,5};
        int sum=0;
        System.out.println("Sum of an array");
        for (int i=0;i< arr.length;i++) {
            sum = sum + arr[i];
        }
            System.out.println(sum);

    }
}
