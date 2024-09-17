package corejava.task6;

public class CanBalance {
    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1})); // true
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1})); // false
        System.out.println(canBalance(new int[]{10, 10})); // true
    }

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum == totalSum - leftSum) return true;
        }
        return false;
    }
}
