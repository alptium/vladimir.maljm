package bankaloans;

public class Loan {
	
	private String loanName;
	private int loanID;
	private int loanAmount;
	private int loanPeriod;
	private int nomInterestRate;
	private int montlyAnnuity;
	private int bankFee;
	private String employementStatus;
	
		
	public Loan (String loanName, String lastName, int birthDate, int birthMounth, int birthYear, String jmbg, String maritalStatus,String employementStatus) {
		
		this.loanName = loanName;
		this.loanID = loanID;
		this.loanAmount = loanAmount;
		this.loanPeriod = loanPeriod;
		this.nomInterestRate = birthYear;
		this.montlyAnnuity = jmbg;
		this.bankFee = maritalStatus;
		this.employementStatus = employementStatus;
	}
		
		public String getfirstName() {
			return loanName;
		}
		
		public String getLastName() {
			return loanID;
		}
		
		public int getbirthDate() {
			return loanAmount;
		}
		
		public int getbirthMonth() {
			return loanPeriod;
		}
		
		public int getbirthYear() {
			return nomInterestRate;
		}
		
		public String getjmbg() {
			return montlyAnnuity;
		}
		
		public String getmaritalStatus() {
			return bankFee;
		}
		
		public String getemployementStatus() {
			return employementStatus;
		}
		
		
}
