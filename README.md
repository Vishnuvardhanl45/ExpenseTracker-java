# ExpenseTracker-java

Project Name: Expense Tracker

Programming Language: Java

Description:

A simple expense tracker application that allows users to register, log in, add expenses, and view their expenses. The application stores user information and expenses in memory.

Code Structure:

Expense: A class representing an expense with properties for date, category, and amount.
Expense(String date, String category, double amount): The constructor initializes the expense properties.
getDate(), getCategory(), getAmount(): Getter methods for the expense properties.
toString(): Returns a string representation of the expense.
ExpenseManager: An interface defining the methods for managing expenses and users.
registerUser(String username, String password): Registers a new user.
loginUser(String username, String password): Logs in an existing user.
logoutUser(): Logs out the current user.
addExpense(String date, String category, double amount): Adds an expense for the current user.
displayExpenses(): Displays the expenses for the current user.
ExpenseTracker: A class implementing the ExpenseManager interface and managing users and expenses.
ExpenseTracker(): The constructor initializes the list of users and the current user.
registerUser(String username, String password): Implements the method from the ExpenseManager interface.
loginUser(String username, String password): Implements the method from the ExpenseManager interface.
logoutUser(): Implements the method from the ExpenseManager interface.
addExpense(String date, String category, double amount): Implements the method from the ExpenseManager interface.
displayExpenses(): Implements the method from the ExpenseManager interface.
User: A class representing a user with properties for username, password, and a list of expenses.
User(String username, String password): The constructor initializes the user properties.
getUsername(), getPassword(): Getter methods for the user properties.
getExpenses(): Returns the list of expenses for the user.
addExpense(String date, String category, double amount): Adds an expense to the user's list of expenses.
Main: The main class containing the main method that runs the application.
main(String[] args): The main method initializes the ExpenseManager and Scanner objects and handles user input.

How to Run:

Save the provided code in separate files named Expense.java, ExpenseManager.java, ExpenseTracker.java, User.java, and Main.java.
Compile all the Java files using the command javac Expense.java ExpenseManager.java ExpenseTracker.java User.java Main.java.
Run the compiled Java file using the command java Main.

How to Contribute:

Feel free to modify the code, add new features, or fix any issues you find. When contributing, make sure to follow good coding practices and include clear commit messages.

License:

This project is open-source and licensed under the MIT License. You are free to use, modify, and distribute the code as you see fit.

Acknowledgments:

Thanks to the creators of Java and the developers who contributed to the language and its libraries.
