DECLARE
    v_Age NUMBER;
BEGIN
    FOR cust_rec IN (
        SELECT CustomerID, DOB
        FROM Customers
    ) LOOP

        v_Age := FLOOR(MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12);

        IF v_Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest rate reduced for Customer ID: ' ||
                cust_rec.CustomerID
            );
        END IF;

    END LOOP;

    COMMIT;
END;
/