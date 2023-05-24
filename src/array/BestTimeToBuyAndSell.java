package array;

import java.util.Scanner;
public class BestTimeToBuyAndSell {
    public int maxProfit(final int[] arr){
        int maxProfit = 0;
        if(arr.length==0 || arr.length==1){
            return maxProfit;
        }

        int[] pfMin = new int[arr.length];
        pfMin[0] = arr[0];
        for(int i=1;i<arr.length; i++){
            if(arr[i]<pfMin[i-1]){
                pfMin[i] = arr[i];
            }else{
                pfMin[i] = pfMin[i-1];
            }
        }

        for(int i=arr.length-1; i>=0;i--){
            maxProfit = Math.max(maxProfit, arr[i]-pfMin[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        BestTimeToBuyAndSell btbs = new BestTimeToBuyAndSell();
        System.out.println(btbs.maxProfit(arr));

    }
}
