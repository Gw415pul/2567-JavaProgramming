package labsheet04;
import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();
	}
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectValid;
		
		while (true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			System.out.print("Enter subjec code (7 digits): " );
			subjectCode = scanner.nextLine();
			
			isStudentIDValid = isLength(studentID,10);
			isSubjectValid = isLength(subjectCode,7);
			
			if(isStudentIDValid && isSubjectValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				displayData(isITStudent, isITSubject);
				break;
			}else {
				System.out.println("Invalid input! Student ID must be 10 digits and "+ "Subject Code must be 7 digits");
			}
			
		}
	}
	
	public static boolean isLength(String input, int requiredLength) {
		if(input.length()==10 && input.length()==7) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isITStudent(String studentID) {
		if(studentID.substring(3,6)=="311") {
			System.out.println(studentID+" 1st year student in IT");
			return true;
		}else {
			System.out.println(studentID+"is not 1st year student in IT");
			return false;
		}
	}
	
	public static boolean isITSubject( String subjectCode) {
		if(subjectCode.substring(0,2)=="21") {
			System.out.println(subjectCode+"Enroll in courses for Year 1");
			return true;
		}else {
			System.out.println(subjectCode+"not enroll in courses for Year 1");
			return false;
		}
	}
	
	public static void displayData(boolean isITStudent, boolean isITSubject) {
		System.out.println("Student id: "+isITStudent+ isITSubject);
	}

}
