package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class StringInJava {
    public String sortString(char[] charArr){
        int[] arr = new int[26];
        for(int i=0; i<charArr.length; i++){
            arr[charArr[i]-'a']++;
        }

        //System.out.println(Arrays.toString(arr));
        String str = "";
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i]; j++){
                //char ch = (char)(97 + i);
                str += String.valueOf((char)(97 + i));
            }
        }
        return str;
    }

    public boolean isPalindrome(String str){
        int initial = 0;
        int end = str.length()-1;
        while(initial<end){
            if(str.charAt(initial) != str.charAt(end))
                return false;

            initial++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringInJava strObj = new StringInJava();

        String str = scan.next();

        System.out.println("Normal String: " + str);

        String sortedStr = strObj.sortString(str.toCharArray());
        System.out.println("Sorted str: " + sortedStr);

        boolean isPalin = strObj.isPalindrome(str);
        System.out.println("String isPalindrome: " + isPalin);

        /*
        String str1 = "salman";
        str1.replace();
        HashMap<Character,Integer> hm = new HashMap<>();

        String str = "dfal";
        if(hm.containsKey('c')){
            Character ch = str.charAt(0);
            hm.put('c', 1);
        }

        HashSet<Character> hs = new HashSet<>();
        String str1 = "";
        str1 = String.valueOf()

        if(hs.contains('c')){

        }
        */


    }
}
