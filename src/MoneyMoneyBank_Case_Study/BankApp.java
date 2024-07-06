package MoneyMoneyBank_Case_Study;

public class BankApp {

	public static void main(String[] args) {
		  BankFactory factory = new MMBankFactory();

	        SavingAcc savingAcc = factory.getNewSavingAcc(1, "Devin Fernandez", 200.0f, true);
	        CurrentAcc currentAcc = factory.getNewCurrentAcc(2, "Elanie Johnson", 3000.0f, 500.0f);
	       
	        
	        
	        System.out.println(savingAcc);
	        savingAcc.withdraw(600);
	        System.out.println(savingAcc);
	        
	        
	        System.out.println("================================================================");
	        
	        
	        System.out.println(currentAcc);
	        currentAcc.withdraw(2300);
	        System.out.println(currentAcc);


	}

}
