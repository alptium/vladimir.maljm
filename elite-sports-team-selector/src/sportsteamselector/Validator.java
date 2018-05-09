package sportsteamselector;

public class Validator {
	
	public static boolean validateAge(int age) {
		return age >= 18;
	}
	
	public static boolean validateDiopter(double diopterValue) {
		return diopterValue < 0.5;
	}
	
	public static boolean validateHeartProblems(String heartProblems) {
		return heartProblems.equalsIgnoreCase("N");
	}
	
	public static boolean isJunior(int age) {
		return age >= 18 && age <= 35;
	}
	
	public static boolean isSenior(int age) {
		return age > 35 && age <= 65;
	}
	
}
