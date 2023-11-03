package ArraysQuestions;

public class OddLengthSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};

        int len = arr.length;
        int sum = 0;
        for(int i = 0; i< len;i++)
        {
            for(int j=i; j <len;j++)
            {
                if((j-i)%2 ==0 )
                {
                    int currSum = 0;
                    for(int k=i; k<=j; k++){
                        currSum += arr[k];
                    }
                    sum += currSum;
                }
            }
        }
        System.out.println(sum);
    }
}
