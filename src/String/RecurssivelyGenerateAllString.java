package String;

import java.util.HashSet;
import java.util.Set;

public class RecurssivelyGenerateAllString {
    static int n;
    static Set<String> numsSet = new HashSet();

    private static String generate(String curr) {
        if (curr.length() == n) {
            if (!numsSet.contains(curr)) {
                return curr;
            }

            return "";
        }

        String addZero = generate(curr + "0");
        if (addZero.length() > 0) {
            return addZero;
        }

        return generate(curr + "1");
    }
    public static String findDifferentBinaryString(String[] nums) {
        n = nums.length;
        for (String s : nums) {
            numsSet.add(s);
        }

        return generate("");
    }

    public static void main(String[] args) {
        String[] nums = {"000","011","001"};
        String ans = findDifferentBinaryString(nums);
        System.out.println();
    }
}
