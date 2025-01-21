package collections.MapInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Studentt {
    int rollNumber;
    String name;

    public Studentt(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{rollNumber=" + rollNumber + ", name='" + name + "'}";
    }
}

class Mainn {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Alice"));

        students.sort(Comparator.comparing((Student student) -> student.name)
                .thenComparing(student -> student.rollNumber));
        System.out.println("Sorted Students by Name and Roll Number: " + students);
    }
}