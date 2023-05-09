package recursion;
import java.util.Scanner;

public class MagicNumber {
    public int sumD(int num){
        if (num == 0)
            return 0;

        return sumD(num/10) + num%10;
    }

    public int solve(int num){
        while(num >= 10){
            num = sumD(num);
        }
        return num ==1 ? 1 : 0;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(new MagicNumber().solve(num));
    }
}
