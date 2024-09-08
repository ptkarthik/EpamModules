package corejava.task4.strings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringRotation {
    public static final Logger logger = LogManager.getLogger(StringRotation.class);

    public static void main(String[] args) {
        String s1= "karthikeyan";
        String s2= "ikeyankarth";
        logger.info(findStringRotationOrNot(s1,s2));
    }

    private static boolean findStringRotationOrNot(String s1, String s2) {
        String concatenated=s1+s1;
        logger.info(concatenated);
        if(concatenated.contains(s2)) {
            return true; }
        else {
        return false; }
    }
}
