package collections.MapInterface;
import java.util.*;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;

    // Constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.rollNumber - other.rollNumber; // Ascending order
    }

    @Override
    public String toString() {
        return "Student{rollNumber=" + rollNumber + ", name='" + name + "'}";
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students);
        System.out.println("Sorted Students: " + students);
    }
}