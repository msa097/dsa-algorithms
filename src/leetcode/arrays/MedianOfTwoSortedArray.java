package leetcode.arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Ind = 0;
        int num2Ind = 0;
        int newInd = 0;
        int[] newArr = new int[nums1.length+nums2.length];
        while(num1Ind<nums1.length && num2Ind<nums2.length){
            if(nums1[num1Ind]<nums2[num2Ind]){
                newArr[newInd++] = nums1[num1Ind++];
            }else{
                newArr[newInd++] = nums2[num2Ind++];
            }
        }

        while(num1Ind< nums1.length){
            newArr[newInd++] = nums1[num1Ind++];
        }
        while(num2Ind< nums2.length){
            newArr[newInd++] = nums2[num2Ind++];
        }
        System.out.println(Arrays.toString(newArr));
        return newArr.length%2==0 ? (double)(newArr[newArr.length/2 -1] + newArr[(newArr.length/2)])/2 : newArr[(newArr.length+1)/2-1];
    }
    public static void main(String[] args){
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};

        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        System.out.println(obj.findMedianSortedArrays(num1, num2));
    }
}
