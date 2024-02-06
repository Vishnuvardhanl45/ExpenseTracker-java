import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

    private String username;
    private String password;
    private List<Expense> expenses;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.expenses = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(String date, String category, double amount) {
        expenses.add(new Expense(date, category, amount));
    }
}
