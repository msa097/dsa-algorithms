package array;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysWithNQueries {
    public int[] countEvenFreqInGivenRange(int[] arr,int[][] queriesArr){
        // get sum of even freq array
        int[] freqArr = new int[arr.length];
        freqArr[0] = arr[0]%2==0 ? 1 : 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]%2==0){
                freqArr[i] = freqArr[i-1] + 1;
            }else{
                freqArr[i] = freqArr[i-1];
            }
        }

        // Get the resultant array
        int[] resFreArr = new int[queriesArr.length];
        for(int i=0; i<queriesArr.length; i++){
            int initial = queriesArr[i][0];
            int end = queriesArr[i][1];

            if(initial==0){
                resFreArr[i] = freqArr[end];
            }else{
                resFreArr[i] = freqArr[end] - freqArr[initial-1];
            }
        }
        return resFreArr;
    }

    public int[] countSumInGivenRange(int[] arr, int[][] queriesArr){
        // prefix sum
        int[] pfSum = new int[arr.length];
        pfSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pfSum[i] = pfSum[i-1]+arr[i];
        }

        int[] resultArr = new int[queriesArr.length];
        for(int i=0; i<queriesArr.length; i++){
            int initial = queriesArr[i][0];
            int end = queriesArr[i][1];

            if(initial==0){
                resultArr[i] = pfSum[end];
            }else{
                resultArr[i] = pfSum[end] - pfSum[initial-1];
            }
        }
        return resultArr;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element in the array");
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the number of queries");
        int query = scan.nextInt();
        int[][] queriesArr = new int[query][2];
        for(int i=0; i<queriesArr.length; i++){
            for(int j=0; j<queriesArr[i].length; j++){
                queriesArr[i][j] = scan.nextInt();
            }
        }

        //int[] resultArr = new ArraysWithNQueries().countSumInGivenRange(arr,queriesArr);
        int[] resultArr = new ArraysWithNQueries().countEvenFreqInGivenRange(arr,queriesArr);
        System.out.println(Arrays.toString(resultArr));

    }
}
