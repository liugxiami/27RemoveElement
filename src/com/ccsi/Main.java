package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] arr={3,2,2,3,4};
        System.out.println(removeElement1(arr,3));
    }
    //Given an array and a value,remove all instances of that value in place and return the new length.
    public static int removeElement(int[] nums,int val){
        if(nums==null||nums.length==0)return 0;
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            if(val==nums[i]){
                for (int j = i; j < len-1 ; j++) {
                    nums[j]=nums[j+1];
                }
                len-=1;
            }
        }
        return len;
    }
    //It looks like this is a better method.
    public static int removeElement1(int[] nums,int val){
        if(nums==null||nums.length==0)return 0;
        int newLen=0;
        for (int i = 0; i < nums.length; i++) {
            if(val!=nums[i]){
                nums[newLen++]=nums[i];
            }
        }
        return newLen;
    }
}
