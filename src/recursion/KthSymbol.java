package recursion;
import java.util.Scanner;
public class KthSymbol {
    public int solve(int A, int B){
        if( A==1){
            return 0;
        }
        int mid = (int)Math.pow(2,A-1)/2;
        if(B-1 < mid)
            return solve(A-1,B);
        else
            return  solve(A-1,B-mid) & 1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int index = scan.nextInt();
        System.out.println(new KthSymbol().solve(num,index));

    }
}
