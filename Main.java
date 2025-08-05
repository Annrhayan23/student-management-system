import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    manager.addStudent(new Student(id, name, grade));
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    manager.searchById(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    manager.deleteById(sc.nextInt());
                    break;
                case 5:
                    System.out.println("👋 Exiting...");
                    break;
                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
