package MustDoQuestions.Strings;

public class LargestPalindromeSubstring
{
    public static void main(String[] args) {

        String str = "aaaabbaa";
        String ans = largestPalindromeSubstring(str);
        System.out.println("Largest Palindrome Substring "+ans);
    }
    static String largestPalindromeSubstring(String str){

        int n = str.length();
        int start = 0 , end = 1;

        int low , high ;
        for (int i = 0; i < n; i++){

            // for even char
            low = i-1;
            high = i;

            while(low>=0 && high <n && str.charAt(low) == str.charAt(high))
            {
                if(high - low + 1 >end)
                {
                    start = low;
                    end = high- low +1;
                }
                low--;
                high++;
            }


            // for odd number of char
            low = i-1;
            high = i+1;

            while(low>=0 && high<n && str.charAt(low) == str.charAt(high))
            {
                if(high - low + 1 >end)
                {
                    start = low;
                    end = high - low +1;
                }
                low--;
                high++;
            }
        }
        return str.substring(start,start+end);
    }
}
