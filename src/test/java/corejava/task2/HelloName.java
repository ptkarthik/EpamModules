package corejava.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class HelloName {
    public static final Logger logger= LogManager.getLogger(HelloName.class);
    public static void main(String[] args) {
        logger.info("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        logger.info("Hello"+" "+name);
    }
}
