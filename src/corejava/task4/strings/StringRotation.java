package corejava.task4.strings;

public class StringRotation {
    public static void main(String[] args) {
        String s1= "karthikeyan";
        String s2= "ikeyankarth";
        System.out.println(findStringRotationOrNot(s1,s2));
    }

    private static boolean findStringRotationOrNot(String s1, String s2) {
        String concatenated=s1+s1;
        System.out.println(concatenated);
        if(concatenated.contains(s2)) {
            return true; }
        else {
        return false; }
    }
}
