/***
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 *
 * Problem Constraints
 *      1 <= |A| <= 100000
 *      -10^9 <= A[i] <= 10^9
 *  Input Format
 *      The only argument given is the integer array A.
 *  Output Format
 *      Return whether the given array contains a subarray with a sum equal to 0.
 *
 *  Input 1:
 *      A = [1, 2, 3, 4, 5]
 *  Output 1:
 *      0
 * Input 2:
 *      A = [-1, 1]
 * Output 2:
 *      1
 */



package basic_hashing;
import java.util.HashSet;
import java.util.Scanner;

public class SubArrayZeroSum {

    public int solve(int[] A) {
        boolean isExist = false;
        long[] prefSum = new long[A.length];
        HashSet<Long> uniqSet = new HashSet<>();
        // prefix array
        for(int i=0; i<A.length; i++){
            if(i==0)
                prefSum[i] = A[i];
            else
                prefSum[i] = prefSum[i-1] + A[i];
        }

        // prefix frequency hashMap
        uniqSet.add(prefSum[0]);
        for(int i=1; i<prefSum.length; i++){
            if(uniqSet.contains(prefSum[i]) || prefSum[i] == 0){
                isExist = true;
                break;
            }else{
                uniqSet.add(prefSum[i]);
            }
        }

        return isExist ? 1 : 0;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // read number of element in array
        int n = scan.nextInt();
        // define the array of size n
        int[] arr = new int[n];
        // Initialize the array
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        SubArrayZeroSum subArrayObj = new SubArrayZeroSum();
        int res = subArrayObj.solve(arr);
        System.out.println(res);

    }
}
