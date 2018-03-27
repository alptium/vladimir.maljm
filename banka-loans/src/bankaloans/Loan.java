package bankaloans;

public class Loan {
	
	private String loanName;
	private int loanID;
	private int loanAmount;
	private int loanPeriod;
	private int nomInterestRate;
	private int montlyAnnuity;
	private int bankFee;
	
	public Loan (String loanName, int loanID, int loanAmount, int loanPeriod, int nomInterestRate, int montlyAnnuity, int bankFee ) {
		
		this.loanName = loanName;
		this.loanID = loanID;
		this.loanAmount = loanAmount;
		this.loanPeriod = loanPeriod;
		this.nomInterestRate = nomInterestRate;
		this.montlyAnnuity = montlyAnnuity;
		this.bankFee = bankFee;
	}
		
		public String getloanName() {
			return loanName;
		}
		
		public int getloanID() {
			return loanID;
		}
		
		public int getloanAmount() {
			return loanAmount;
		}
		
		public int getloanPeriod() {
			return loanPeriod;
		}
		
		public int getnomInterestRate() {
			return nomInterestRate;
		}
		
		public int getmontlyAnnuity() {
			return montlyAnnuity;
		}
		
		public int getbankFee() {
			return bankFee;
		}
		
		
}
