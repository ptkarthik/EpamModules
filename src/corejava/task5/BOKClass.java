package corejava.task5;

public class BOKClass {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));
        System.out.println(inOrder(1, 2, 1, false));
        System.out.println(inOrder(1, 1, 2, true));
    }
}