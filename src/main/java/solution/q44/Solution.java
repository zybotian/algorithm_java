package solution.q44;

import java.util.Arrays;

public class Solution {

    /**
     * 扑克牌的顺序是否是顺子
     * @param numbers
     * @return
     */
    public static boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        Arrays.sort(numbers);

        int count = 0, diff = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                count++;
                continue;
            }
            if (numbers[i] != numbers[i + 1]) {
                diff += numbers[i + 1] - numbers[i] - 1;
            } else {
                return false;
            }
        }
        return count >= diff;
    }

    public static void main(String[] args) {
        System.out.println(isContinuous(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isContinuous(new int[]{5, 6, 8, 9, 0}));
        System.out.println(isContinuous(new int[]{5, 6, 0, 8, 0}));
        System.out.println(isContinuous(new int[]{4, 6, 8, 0, 0}));
        System.out.println(isContinuous(new int[]{5, 5, 3, 4, 7}));
    }
}
