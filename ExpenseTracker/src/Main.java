import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseTracker();

        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Log In");
            System.out.println("3. Log Out");
            System.out.println("4. Add Expense");
            System.out.println("5. Display Expenses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String registerUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String registerPassword = scanner.nextLine();
                    expenseManager.registerUser(registerUsername, registerPassword);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    if (expenseManager.loginUser(loginUsername, loginPassword)) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;
                case 3:
                    expenseManager.logoutUser();
                    break;
                case 4:
                    System.out.print("Enter date (DD/MM/YYYY): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter amount: $");
                    double amount = scanner.nextDouble();
                    expenseManager.addExpense(date, category, amount);
                    break;
                case 5:
                    expenseManager.displayExpenses();
                    break;
                case 6:
                    System.out.println("Exiting the Expense Tracker. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
