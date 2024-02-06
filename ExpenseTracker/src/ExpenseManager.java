public interface ExpenseManager {
    void registerUser(String username, String password);

    boolean loginUser(String username, String password);

    void logoutUser();

    void addExpense(String date, String category, double amount);

    void displayExpenses();
}
