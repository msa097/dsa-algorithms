package recursion;

public class RecursionMCQ3 {
    static int bar(int x, int y){
        if (y==0){
            return 0;
        }
        return x+ bar(x,y-1);
    }
    static int foo(int x, int y){
        if (y==0 || y==1){
            return y;
        }
        return bar(x,foo(x,y-2));
    }

    public String solve(String A, String B) {
        char[] arr = A.toCharArray();
        int initial = 0;
        int end = -1;
        for(int i=0; i<arr.length; i++){
            String temp= arr[i] + "";
            if(temp.equals(B)){
                end = i;
                break;
            }
        }

        while(initial<end){
            char temp = arr[initial];
            arr[initial] = arr[end];
            arr[end] = temp;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args){
        System.out.println(foo(3,5));
        System.out.println(new RecursionMCQ3().solve("hello wolrd", "o"));

    }
}
