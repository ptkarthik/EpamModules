package collections.map.hashmapoptionalprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Custom class
class Student {
    private int id;
    private String name;
    private String major;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    // Overriding toString for a better representation
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    // Override equals and hashCode to ensure proper comparison and use in HashMap
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, major);
    }
}

public class HashMapOptionalProgram {
    public static void main(String[] args) {
        // Create a HashMap to store Student objects
        Map<Integer, Student> studentMap = new HashMap<>();

        // Create some Student objects
        Student student1 = new Student(1, "Alice", "Computer Science");
        Student student2 = new Student(2, "Bob", "Mathematics");
        Student student3 = new Student(3, "Charlie", "Physics");

        // Put students into the HashMap with their IDs as keys
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);

        // Retrieve and print students from the HashMap
        System.out.println("Student with ID 1: " + studentMap.get(1));
        System.out.println("Student with ID 2: " + studentMap.get(2));
        System.out.println("Student with ID 3: " + studentMap.get(3));

        // Iterate over all entries in the HashMap
        System.out.println("\nAll Students:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}

