package ArraysQuestions;

import java.util.*;

public class DiagonalTraverse2
{
    public static void main(String[] args) {
        List<List<Integer>> twoDArrayList = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5, 6)),
                new ArrayList<>(Arrays.asList(7, 8, 9))
        ));

        int[] ans = findDiagonalOrder(twoDArrayList);
        System.out.println(Arrays.toString(ans));
    }
    static public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
        queue.offer(new AbstractMap.SimpleEntry<>(0, 0));
        List<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = queue.poll();
            int row = entry.getKey();
            int col = entry.getValue();
            ans.add(nums.get(row).get(col));

            if (col == 0 && row + 1 < nums.size()) {
                queue.offer(new AbstractMap.SimpleEntry<>(row + 1, col));
            }

            if (col + 1 < nums.get(row).size()) {
                queue.offer(new AbstractMap.SimpleEntry<>(row, col + 1));
            }
        }

        // Java needs conversion
        int[] result = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            result[i] = num;
            i++;
        }

        return result;
    }
}
