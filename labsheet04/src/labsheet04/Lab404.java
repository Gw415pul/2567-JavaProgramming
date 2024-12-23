package labsheet04;
import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        String studentID, subjectCode;

        while (true) {
            System.out.print("Enter Student ID (10 digits): ");
            studentID = scanner.nextLine();

            System.out.print("Enter Subject ID (7 digits): ");
            subjectCode = scanner.nextLine();

            boolean isStudentIDValid = isLength(studentID, 10);
            boolean isSubjectValid = isLength(subjectCode, 7);

            if (isStudentIDValid && isSubjectValid) {
                boolean isITStudent = isITStudent(studentID);
                boolean isITSubject = isITSubject(subjectCode);

                displayData(studentID, subjectCode, isITStudent, isITSubject);
                break;
            } else {
                System.out.println("\nInvalid input!");
                if (!isStudentIDValid) {
                    System.out.println("- Student ID must be exactly 10 digits.");
                }
                if (!isSubjectValid) {
                    System.out.println("- Subject Code must be exactly 7 digits.");
                }
            }
        }
        scanner.close();
    }

    public static boolean isLength(String input, int requiredLength) {
        return input.length() == requiredLength;
    }

    public static boolean isITStudent(String studentID) {
        if (studentID.length() >= 6 && studentID.substring(3, 6).equals("311")) {
            return true;
        }
        return false;
    }

    public static boolean isITSubject(String subjectCode) {
        if (subjectCode.length() >= 2 && subjectCode.substring(0, 2).equals("21")) {
            return true;
        }
        return false;
    }

    public static void displayData(String studentID, String subjectCode, boolean isITStudent, boolean isITSubject) {
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Subject ID: " + subjectCode);

        if (isITStudent) {
            System.out.println("Student ID: " + studentID + " is a 1st year student in IT");
        } else {
            System.out.println("Student ID: " + studentID + " is not a 1st year student in IT");
        }

        if (isITSubject) {
            System.out.println("Enroll in courses for Year 1");
        } else {
            System.out.println("Subject ID is not valid for Year 1");
        }
    }
}
