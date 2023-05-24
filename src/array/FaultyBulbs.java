package array;

import java.util.Scanner;

public class FaultyBulbs {
    public int solve(int[] arr){
        int index = -1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==0){
                index = i;
            }
        }
        if(index==-1){
            return 0;
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        FaultyBulbs fb = new FaultyBulbs();
        System.out.println(fb.solve(arr));

    }
}
