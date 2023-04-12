package qsn.q2;


import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;

public class q2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 80));
        students.add(new Student("Charlie", 95));

        Student topStudent = students.stream()
                .max(Comparator.comparing(Student::getScore))
                .orElse(null);

        System.out.println("Top student: " + topStudent.getName()); // Charlie
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
