package ArraysQuestions;

import java.util.Arrays;

public class ReductionOperationToMakeArrayElementsEqual
{
    public static void main(String[] args) {

        int[] nums = {5,5,3,3,6,7,8,9};
        System.out.println("Min Operations : "+(reductionOperations(nums)));
    }

    static  public int reductionOperations(int[] nums)
    {
        int count=1;
        int ans=0;

        Arrays.sort(nums);

        for(int i = nums.length-2; i >=0 ;i--)
        {
            if(nums[i] != nums[i+1]){
                ans += count;
            }
            count++;
        }
        return ans;
    }
}
