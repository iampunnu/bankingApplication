package net.praveen.banking.config;

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-2;i++){

             if(nums[i]!=nums[i+2]){
                System.out.println(nums[i+2] +" "+nums[i]);
                nums[j]=nums[i];
                j=j+1;
            }
             nums[j++]=nums[nums.length-2];
             nums[j++]=nums[nums.length-1];


        }
        return j;

    }
}