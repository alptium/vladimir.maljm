package bankaloans;

public class Loan {
	
	private String loanName;
	private int loanID;
	private double loanAmount;
	private int loanPeriod;
	private double nomInterestRate;
	private double montlyAnnuity;
	private double bankFee;
	
	public Loan (String loanName, int loanID, double loanAmount, int loanPeriod, double nomInterestRate, double montlyAnnuity, double bankFee) {
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
		
		public double getloanAmount() {
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
		
		public double getnomInterestRate() {
			return nomInterestRate;
		}
		
		public void setNomInterestRate(int nomInterestRate) {
			this.nomInterestRate = nomInterestRate;
		}
		
		public double getmontlyAnnuity() {
			return montlyAnnuity;
		}
		
		public void setMontlyAnnuity(int montlyAnnuity) {
			this.montlyAnnuity = montlyAnnuity;
		}
		
		public double getbankFee() {
			return bankFee;
		}
		
		public void setBankFee(int bankFee) {
			this.bankFee = bankFee;
		}
		
		
}
