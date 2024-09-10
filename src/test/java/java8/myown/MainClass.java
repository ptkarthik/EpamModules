package java8.myown;

public class MainClass {
    public static void main(String[] args) {
       AccessedInterface a= s->s.toLowerCase().substring(0).toLowerCase();
       System.out.println(a.getString("Karthikeyan"));
    }
}
