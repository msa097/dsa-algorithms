package leetcode.arrays;

public class ContainerWithMaxWater {
    public int maxArea(int[] height) {
        int firstLargest = height[0];
        int secondLargest = height[0];
        for(int i=1; i<height.length; i++){
            if(height[i]>firstLargest ){
                secondLargest = firstLargest;
                firstLargest = height[i];
            }else if(height[i]>secondLargest && height[i]!=firstLargest){
                secondLargest = height[i];
            }
        }
        System.out.println("firstLargest: " + firstLargest+ ", SecondLargest: " + secondLargest);
        return firstLargest==secondLargest ? firstLargest*secondLargest : secondLargest*secondLargest;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,1};
        System.out.println(new ContainerWithMaxWater().maxArea(arr));

    }
}
