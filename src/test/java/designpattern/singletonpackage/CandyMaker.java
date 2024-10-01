package designpattern.singletonpackage;

public class CandyMaker {


    private boolean empty;
    private boolean boiled;

    // Private constructor to prevent instantiation
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    // Static inner class responsible for holding the singleton instance
    private static class Holder {
        private static final CandyMaker INSTANCE = new CandyMaker();
    }

    // Public method to provide access to the singleton instance
    public static CandyMaker getInstance() {
        return Holder.INSTANCE;
    }

    // Synchronized methods to make operations thread-safe
    public synchronized void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;

        }
    }

    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {

            boiled = true;
        }
    }

    public synchronized boolean isEmpty() {
        return empty;
    }

    public synchronized boolean isBoiled() {
        return boiled;
    }
}


