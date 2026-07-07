ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

BEGIN
    FOR cust_rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    ) LOOP

        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ' || cust_rec.CustomerID ||
                ' promoted to VIP.'
            );
        END IF;

    END LOOP;

    COMMIT;
END;
/