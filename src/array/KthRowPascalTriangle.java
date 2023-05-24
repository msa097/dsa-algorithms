package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class KthRowPascalTriangle {
    public int[] getRow(int k){
        if(k==0){
            return new int[]{1};
        }
        int[] resultArr = new int[k+1];
        resultArr[0] = 1;

        for(int i=1; i<resultArr.length; i++){
            for(int j=i; j>0; j--){
                resultArr[j] = resultArr[j] + resultArr[j-1];
            }
        }

        return resultArr;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        KthRowPascalTriangle kTriangle = new KthRowPascalTriangle();
        System.out.println(Arrays.toString(kTriangle.getRow(k)));


    }
}
