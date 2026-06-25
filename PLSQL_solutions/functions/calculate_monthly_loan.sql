CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_LoanAmount NUMBER,
    p_InterestRate NUMBER,
    p_Years NUMBER
)
RETURN NUMBER
IS
    v_R NUMBER;
    v_N NUMBER;
    v_EMI NUMBER;
BEGIN
    v_R := p_InterestRate / (12 * 100);
    v_N := p_Years * 12;

    v_EMI := (p_LoanAmount * v_R * POWER(1 + v_R, v_N))
             / (POWER(1 + v_R, v_N) - 1);

    RETURN ROUND(v_EMI, 2);
END;
/