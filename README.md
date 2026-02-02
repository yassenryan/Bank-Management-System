🏦 Banking Management System (Java)
A sophisticated console-based application that simulates a digital banking environment. This project focuses on Abstraction, Inheritance, and Polymorphism to manage different financial account behaviors.

🚀 Features
Account Creation: Register Saving Accounts or Current Accounts with unique properties.

Overdraft Support: Current accounts include a built-in $500 overdraft limit for flexible spending.

Financial Transactions: Secure logic for performing deposits and withdrawals.

Live History: View a detailed transaction log featuring real-time timestamps via LocalDateTime.

Currency Formatting: Automatically displays all balances in professional currency format ($0.00).

🛠️ Tech Stack
Language: Java

APIs: java.time (for timestamps), java.text.NumberFormat (for currency).

Concepts: Abstract Classes, Method Overriding, and List Collections.

📂 Project Structure
Account.java: The abstract base class for all account types.

SavingAccount.java / CurrentAccount.java: Specialized classes with specific withdrawal rules.

Transaction.java: The data model for individual financial records.

Bank.java: The logic controller for managing multiple accounts.

Main.java: The interactive menu and user interface.
