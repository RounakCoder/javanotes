-- Create a new database
CREATE DATABASE UserAccountDB;


USE UserAccountDB;

CREATE TABLE Accounts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    balance DECIMAL(10, 2)
);

-- Insert new user records with their balances
INSERT INTO Accounts (username, balance) VALUES ('Rounak', 5000.00);
INSERT INTO Accounts (username, balance) VALUES ('Vishal', 3200.25);
INSERT INTO Accounts (username, balance) VALUES ('Yash', 4500.50);
INSERT INTO Accounts (username, balance) VALUES ('Radhika', 2700.75);

-- Fetch all records from the Accounts table
SELECT * FROM Accounts;

UPDATE Accounts SET balance = 5200.00 WHERE id = 1;

DELETE FROM Accounts WHERE id = 3;

INSERT INTO Accounts (username, balance) VALUES ('Nikhil', 6000.00);

SELECT * FROM Accounts;
