package corejava.task6;

public class CountClumps {
    public static int countClumps(int[] nums) {
        int clumps = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumps++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return clumps;
    }
    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4})); // 2
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1})); // 2
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1})); // 1
    }
}
