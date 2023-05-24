package array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public int[] rotateKthTimes(int[] arr, int k){
        if(arr.length==0 || arr.length==1)
            return arr;
        int p = 0;
        int[] rotatedArr = new int[arr.length];
        while(k>arr.length){
            k = k-arr.length;
        }
        for(int i=0; i<arr.length-k;i++){
            rotatedArr[i+k] =  arr[i];
        }
        for(int i=arr.length-k; i<arr.length; i++){
            rotatedArr[p++] = arr[i];
        }

        return rotatedArr;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        while(tc-- > 0){
            int numElem = scan.nextInt();
            int[] arr = new int[numElem];
            for(int i=0; i<numElem; i++){
                arr[i] = scan.nextInt();
            }
            int[] newArr = new ArrayRotation().rotateKthTimes(arr, scan.nextInt());
            System.out.println(Arrays.toString(newArr));

        }
    }
}
