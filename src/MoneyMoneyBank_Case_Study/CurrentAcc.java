package MoneyMoneyBank_Case_Study;

public abstract class CurrentAcc extends BankAccount {

	private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            super.deposit(-amount); // Same as withdraw
        } else {
            System.out.println("Cannot withdraw beyond credit limit.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }

}
