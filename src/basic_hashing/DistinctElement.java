/***
 *  Problem Description
 *      You are given an array A of N integers. You will have to return number of distinct elements of the array.
 *
 *  Problem Constraints
 *      1 <= N <= 105
 *      1 <= A[i] <= 109
 *  Input Format
 *      First argument A is an array of integers.
 *  Output Format
 *      Return an integer.
 *
 * A = [3, 4, 3, 6, 6]
 *      output = 3
 * A = [3, 3, 3, 9, 0, 1, 0]
 *      output = 4
 *
 */



package basic_hashing;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctElement {
    public int solve(int[] A) {
        HashSet<Integer> uniqElem= new HashSet<>();
        for(int i=0; i<A.length; i++){
            uniqElem.add(A[i]);
        }
        return uniqElem.size();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> uniqElem= new HashSet<>();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        DistinctElement distObj = new DistinctElement();
        System.out.println(distObj.solve(arr));

    }
}
