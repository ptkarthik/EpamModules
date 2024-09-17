package corejava.task6;

public class LargestSpan {

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    maxSpan = Math.max(maxSpan, j - i + 1);
                    break;
                }
            }
        }
        return maxSpan;
    }

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3})); // 4
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4})); // 6
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4})); // 6
    }
}
