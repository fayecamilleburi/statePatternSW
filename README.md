# Bank Account System Manager
A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.
- **Active accounts**: Allow deposits and withdrawals.
- **Suspended accounts**: Disallow deposits and withdrawals transactions, but allow viewing account information.
- **Closed accounts**: Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.
