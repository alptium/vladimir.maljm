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
		
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getlastName() {
			return lastName;
		}
		
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		
		public int getbirthDate() {
			return birthDate;
		}
		
		public void setbirthDate(int birthDate) {
			this.birthDate = birthDate;
		}
		
		public int getbirthMonth() {
			return birthMonth;
		}
		
		public void setbirthMonth(int birthMonth) {
			this.birthMonth = birthMonth;
		}
		
		public int getbirthYear() {
			return birthYear;
		}
		
		public void setbirthYear(int birthYear) {
			this.birthYear = birthYear;
		}
		
		public String getjmbg() {
			return jmbg;
		}
		
		public void setjmbg(String jmbg) {
			this.jmbg = jmbg;
		}
		
		public String getmaritalStatus() {
			return maritalStatus;
		}
		
		public void setmaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		
		public String getemployementStatus() {
			return employementStatus;
		}
		
		public void setemployementStatus(String employementStatus) {
			this.employementStatus = employementStatus;
		}
		
		
}

