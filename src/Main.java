import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        int i, j;

        System.out.println("Enter the numbers : ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (i = 0, j = arr.length - 1; i <= j; ) {
            if (arr[i] % 2 != 0) {
                if (arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
            else
                i++;
        }
        System.out.println("Array after moving : "+ Arrays.toString(arr));
    }
}