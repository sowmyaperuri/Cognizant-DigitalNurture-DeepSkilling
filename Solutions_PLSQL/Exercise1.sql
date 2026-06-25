UPDATE Customers
SET Balance = 15000
WHERE CustomerID = 2;

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (2, 2, 8000, 6, SYSDATE, SYSDATE + 20);

-- SCENARIO 1
BEGIN
    FOR cust IN (
        SELECT CustomerID, DOB
        FROM Customers
    ) LOOP
        IF FLOOR(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12) > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                '1% discount applied to loans of Customer ID: ' || cust.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/


-- SCENARIO 2

BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
    ) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ID ' || cust.CustomerID || ' promoted to VIP'
            );
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/



-- SCENARIO 3
BEGIN
    FOR loan_rec IN (
        SELECT l.LoanID,
               l.CustomerID,
               c.Name,
               l.EndDate
        FROM Loans l
        JOIN Customers c
          ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || loan_rec.LoanID ||
            ' for customer ' || loan_rec.Name ||
            ' is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/