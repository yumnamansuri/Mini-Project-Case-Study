package MoneyMoneyBank_Case_Study;

public abstract class BankFactory {

	
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
    public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);

}
