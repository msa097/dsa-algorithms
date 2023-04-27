/****
 * Given an array A. You have some integers given in the array B.
 * For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
 *
 * Input Format
 *      First argument A is an array of integers.
 *      Second argument B is an array of integers denoting the queries.
 *
 * Output format
 *      Return an array of integers containing frequency of the each element in B.
 *
 * Input 1
 *      A = [1, 2, 1, 1]
 *      B = [1, 2]
 * Output
 *      [3, 1]
 *
 * Input 2
 *      A = [2, 5, 9, 2, 8]
 *      B = [3, 2]
 *
 * Output 2
 *      [0, 2]
 */
package basic_hashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class FrequencyOfElementQuery {
    public int[] solve(int[] A, int[] B) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int[] result = new int[B.length];

        // create the frequency hashMap
        for(int i=0; i<A.length; i++){
            if(freqMap.containsKey(A[i])){
                int freq = freqMap.get(A[i]) + 1;
                freqMap.put(A[i],freq);
            }else{
                freqMap.put(A[i],1);
            }
        }

        // return the resulted frequency
        for(int i=0; i<B.length; i++){
            if(freqMap.containsKey(B[i]))
                result[i] = freqMap.get(B[i]);
            else
                result[i] = 0;
        }

        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // define the size of both the array
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        // read the 1st array element of
        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt();
        }
        // read the 2st array element of
        for(int i=0; i<m; i++){
            arr2[i] = scan.nextInt();
        }

        FrequencyOfElementQuery freqOfElemQuery = new FrequencyOfElementQuery();
        int[] result = freqOfElemQuery.solve(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }

}
