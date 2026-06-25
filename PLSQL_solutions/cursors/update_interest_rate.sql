DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate
        FROM Loans
        FOR UPDATE;
BEGIN
    FOR loan_rec IN UpdateLoanInterestRates LOOP
        UPDATE Loans
        SET InterestRate = loan_rec.InterestRate + 1
        WHERE CURRENT OF UpdateLoanInterestRates;

        DBMS_OUTPUT.PUT_LINE(
            'Loan ID: ' || loan_rec.LoanID ||
            ' updated successfully.'
        );
    END LOOP;

    COMMIT;
END;
/