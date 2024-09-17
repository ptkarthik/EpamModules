package corejava.task6;

public class MaxMirror {
    public static int maxMirror(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int length = 0;
                while (i + length < nums.length && j - length >= 0 && nums[i + length] == nums[j - length]) {
                    length++;
                }
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1})); // 3
        System.out.println(maxMirror(new int[]{1, 2, 1, 4})); // 3
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1})); // 2
    }
}
