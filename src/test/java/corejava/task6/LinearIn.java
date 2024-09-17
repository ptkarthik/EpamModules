package corejava.task6;

public class LinearIn {
    public static boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length && j < inner.length; i++) {
            if (outer[i] == inner[j]) {
                j++;
            }
        }
        return j == inner.length;
    }

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4})); // true
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // false
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4})); // true
    }
}
