package array;
import java.util.Scanner;
import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int carry = (arr[arr.length-1]+1)/10;
        arr[arr.length-1] = (arr[arr.length-1] + 1)%10;
        if(carry>0){
            for(int i=arr.length-2; i>=0; i--){
                arr[i] = (arr[i] + carry)%10;
                carry = (arr[i] + carry)/10;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
