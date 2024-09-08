package corejava.task5;

public class HelloThere {

    public static String withoutString(String base, String remove) {
        String lowerBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();

        String result = base;
        int index;

        while ((index = lowerBase.indexOf(lowerRemove)) != -1) {

            result = result.substring(0, index) + result.substring(index + remove.length());

            lowerBase = result.toLowerCase();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
    }
}
