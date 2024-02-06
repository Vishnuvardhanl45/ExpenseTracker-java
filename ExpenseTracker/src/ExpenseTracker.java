import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker implements Serializable, ExpenseManager {

    private List<User> users;
    private User currentUser;

    public ExpenseTracker() {
        this.users = new ArrayList<>();
        this.currentUser = null;
    }

    public void registerUser(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("User registered successfully.");
    }

    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public void logoutUser() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }

    public void addExpense(String date, String category, double amount) {
        if (currentUser != null) {
            currentUser.addExpense(date, category, amount);
            System.out.println("Expense added successfully.");
        } else {
            System.out.println("Please log in to add expenses.");
        }
    }

    public void displayExpenses() {
        if (currentUser != null) {
            List<Expense> userExpenses = currentUser.getExpenses();
            if (userExpenses.isEmpty()) {
                System.out.println("No expenses to display.");
            } else {
                System.out.println("---------------------------------------------------------------");
                System.out.printf("| %-12s | %-20s | %-10s |\n", "Date", "Category", "Amount");
                System.out.println("---------------------------------------------------------------");
                double totalAmount = 0.0;
                for (Expense expense : userExpenses) {
                    System.out.printf("| %-12s | %-20s | $%-9.2f |\n", expense.getDate(), expense.getCategory(),
                            expense.getAmount());
                    totalAmount += expense.getAmount();
                }
                System.out.println("---------------------------------------------------------------");
                System.out.printf("| %-35s | $%-9.2f |\n", "Total Amount", totalAmount);
                System.out.println("---------------------------------------------------------------");
            }
        } else {
            System.out.println("Please log in to view expenses.");
        }
    }
}
