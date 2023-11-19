package ArraysQuestions;

import java.util.Arrays;

/*
    leetcode => 1838
    The frequency of an element is the number of times it occurs in an array.
    You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
    Return the maximum possible frequency of an element after performing at most k operations


    topics -> sliding window

 */
public class FrequencyOfMostFrequentElement
{
    public static void main(String[] args)
    {
        int[] arr = {3,12,7,22,18,24,6};
        int k = 20;

        int ans = maxFrequency(arr,k);
        System.out.println(ans);
    }
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int cur = 0;
        for(int right = 0; right<nums.length; right++){
            int target = nums[right];
            cur += target;

            if( (right-left+1)*target - cur > k  ){
                cur -= nums[left];
                left++;
            }
        }
        return nums.length-left;
    }
}
