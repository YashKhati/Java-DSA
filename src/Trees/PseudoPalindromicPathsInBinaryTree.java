package Trees;

import java.util.HashMap;
import java.util.Map;

public class PseudoPalindromicPathsInBinaryTree
{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val)
        {
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right)
        {
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        int count = pseudoPalindromicPaths(root);
        System.out.println(count);
    }
    /*-----------------------------------------------------------------------------------------------------*/
    private static int count = 0;

    public static int pseudoPalindromicPaths (TreeNode root) {
        checkPaths(root, new HashMap<>());
        return count;
    }

    private static void checkPaths(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);

        if (node.left == null && node.right == null) {
            if (pseudoPalindrome(map)) {
                count++;
            }
            map.put(node.val, map.getOrDefault(node.val, 0) - 1);
            return;
        }

        checkPaths(node.left, map);
        checkPaths(node.right, map);
        map.put(node.val, map.getOrDefault(node.val, 0) - 1);
    }

    private static boolean pseudoPalindrome(Map<Integer, Integer> map) {
        int mid = 0;

        for (int value : map.values()) {
            if (value <= 0) {
                continue;
            }

            if (value % 2 == 1 && mid > 0) {
                return false;
            }

            if (value % 2 == 1) {
                mid++;
            }
        }

        return true;
    }
}
