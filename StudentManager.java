import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("✅ Student added!");
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.");
            return;
        }
        System.out.println("\n📋 Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("🔍 Found: " + s);
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    public void deleteById(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                System.out.println("🗑️ Student deleted.");
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }
}
