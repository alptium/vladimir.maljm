package bankaloans;

public class Client {
	
	private String firstName;
	private String lastName;
	private int birthDate;
	private int birthMonth;
	private int birthYear;
	private String jmbg;
	private String maritalStatus;
	private String employementStatus;
	
		
	public Client (String firstName, String lastName, int birthDate, int birthMounth, int birthYear, String jmbg, String maritalStatus,String employementStatus) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthMonth = birthMounth;
		this.birthYear = birthYear;
		this.jmbg = jmbg;
		this.maritalStatus = maritalStatus;
		this.employementStatus = employementStatus;
	}
		
		public String getfirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public int getbirthDate() {
			return birthDate;
		}
		
		public int getbirthMonth() {
			return birthMonth;
		}
		
		public int getbirthYear() {
			return birthYear;
		}
		
		public String getjmbg() {
			return jmbg;
		}
		
		public String getmaritalStatus() {
			return maritalStatus;
		}
		
		public String getemployementStatus() {
			return employementStatus;
		}
		
		
}

