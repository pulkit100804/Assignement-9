import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations ops = new StudentOperations();

        while (true) {
            System.out.println("\n===== Student Data Entry with MySQL JDBC =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Add
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student PRN (integer): ");
                    int prn = 0;
                    try {
                        prn = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid PRN. Try again.");
                        break;
                    }
                    System.out.print("Enter Batch: ");
                    String batch = sc.nextLine();

                    ops.addStudent(new Student(name, prn, batch));
                    break;

                case 2:
                    // Display
                    ops.displayAllStudents();
                    break;

                case 3:
                    // Search
                    System.out.print("Enter PRN to Search: ");
                    int searchPrn = 0;
                    try {
                        searchPrn = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid PRN. Try again.");
                        break;
                    }
                    ops.searchStudent(searchPrn);
                    break;

                case 4:
                    // Update
                    System.out.print("Enter PRN of Student to Update: ");
                    int updatePrn = 0;
                    try {
                        updatePrn = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid PRN. Try again.");
                        break;
                    }
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Batch: ");
                    String newBatch = sc.nextLine();

                    ops.updateStudent(updatePrn, newName, newBatch);
                    break;

                case 5:
                    // Delete
                    System.out.print("Enter PRN of Student to Delete: ");
                    int delPrn = 0;
                    try {
                        delPrn = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid PRN. Try again.");
                        break;
                    }
                    ops.deleteStudent(delPrn);
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting application. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
