package MoneyMoneyBank_Case_Study;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "MMSavingAcc: " + super.toString();
    }

}
