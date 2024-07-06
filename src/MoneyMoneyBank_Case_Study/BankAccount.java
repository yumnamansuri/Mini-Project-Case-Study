package MoneyMoneyBank_Case_Study;

public abstract class BankAccount {

	 private int accNo;
	    private String accNm;
	    private float accBal;
	    
		public BankAccount(int accNo, String accNm, float accBal) {
			super();
			this.accNo = accNo;
			this.accNm = accNm;
			this.accBal = accBal;
		}
	    

	    public int getAccNo() {
	        return accNo;
	    }

	    public String getAccNm() {
	        return accNm;
	    }

	    public void setAccNm(String accNm) {
	        this.accNm = accNm;
	    }

	    public float getAccBal() {
	        return accBal;
	    }

	    public void withdraw(float amount) {
	    	this.accBal-=amount;
	    }
	    public void deposit(float amount) {
	        this.accBal += amount;
	    }

	    @Override
	    public String toString() {
	        return "Account No: " + accNo + ", Account Name: " + accNm + ", Account Balance: " + accBal;
	    }
}


