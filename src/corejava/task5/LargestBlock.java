package corejava.task5;

public class LargestBlock {

    public static int maxBlock(String s) {

        if (s.isEmpty()) {
            return 0;
        }


        int maxLength = 1;
        int currentLength = 1;


        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {

                currentLength++;
            } else {

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }

                currentLength = 1;
            }
        }


        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        return maxLength;
    }

    public static void main(String[] args) {

        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }
}

