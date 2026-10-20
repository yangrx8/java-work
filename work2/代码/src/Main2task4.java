import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2task4 {
        public static void main(String[] args) {
            List<Student> students = Arrays.asList(
                    new Student("Alice", 85),
                    new Student("Bob", 58),
                    new Student("Charlie", 90),
                    new Student("David", 45),
                    new Student("Eve", 72),
                    new Student("Frank", 60),
                    new Student("Grace", 55),
                    new Student("Heidi", 95)
            );

            List<String> passingStudents = students.stream()
                    .filter(s -> s.getScore() >= 60)
                    .map(s -> s.getName().toUpperCase())
                    .sorted()
                    .toList();

            System.out.println(passingStudents);
        }
    }

