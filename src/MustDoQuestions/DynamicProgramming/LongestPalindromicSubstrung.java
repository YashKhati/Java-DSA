package MustDoQuestions.DynamicProgramming;

public class LongestPalindromicSubstrung {
    public static void main(String[] args) {

            String str = "babad";
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s)
    {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0, end = 0;
        for (int diagonal = 0; diagonal < s.length(); diagonal++)
        {
            for (int i = 0, j = diagonal; j < s.length(); i++, j++)
            {
                if (diagonal == 0)
                    dp[i][j] = true;
                else if (diagonal == 1)
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                else
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);

                if (dp[i][j])
                {
                    start = i;
                    end = j+1;
                }
            }
        }
        return s.substring(start, end);
    }
}
