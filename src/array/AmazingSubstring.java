package array;

import java.util.Scanner;

public class AmazingSubstring {
    public int solve(String str){
        int ans = 0;
        int count = 0;
        int len = str.length();
        while(len > 0){
            count = count+1;
            char ch = str.charAt(len-1);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                ans = (ans + count)%10003;
            }
            len--;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        AmazingSubstring amazSubs = new AmazingSubstring();
        System.out.println(amazSubs.solve(str));
    }
}
