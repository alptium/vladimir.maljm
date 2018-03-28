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
		
		public void setLoanName(String loanName) {
			this.loanName = loanName;
		}
		
		public int getloanID() {
			return loanID;
		}
		
		public void setLoanID(int loanID) {
			this.loanID = loanID;
		}
		
		public int getloanAmount() {
			return loanAmount;
		}
		
		public void setLoanAmount(int loanAmount) {
			this.loanAmount = loanAmount;
		}
		
		public int getloanPeriod() {
			return loanPeriod;
		}
		
		public void setLoanPeriod(int loanPeriod) {
			this.loanPeriod = loanPeriod;
		}
		
		public int getnomInterestRate() {
			return nomInterestRate;
		}
		
		public void setNomInterestRate(int nomInterestRate) {
			this.nomInterestRate = nomInterestRate;
		}
		
		public int getmontlyAnnuity() {
			return montlyAnnuity;
		}
		
		public void setMontlyAnnuity(int montlyAnnuity) {
			this.montlyAnnuity = montlyAnnuity;
		}
		
		public int getbankFee() {
			return bankFee;
		}
		
		public void setBankFee(int bankFee) {
			this.bankFee = bankFee;
		}
		
		
}
