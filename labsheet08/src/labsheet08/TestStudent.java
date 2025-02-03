package labsheet08;
import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		
		System.out.print("How many student in class : ");
		int numberofStudent = scan.nextInt();
		scan.nextLine();
		
		Student[] students = new Student[numberofStudent];
		
		for(int i =0; i<numberofStudent;i++) {
			students[i] = new Student();
			System.out.println("INPUT INFORMATION OF STUDENT"+(i+1));
			Line();
			System.out.print("\nInput student Name : ");
			//String stdName = scan.nextLine();
			 students[i].setName(scan.nextLine());
			
			System.out.print("Input student Score : ");
			int stdScore = scan.nextInt();
			scan.nextLine();
			students[i].setScore(stdScore);
			
			while (!students[i].checkScore()) {
				System.out.print("Input stdent score, againt: ");
				stdScore= scan.nextInt();
				students[i].setScore(stdScore);
				
			}
			}
		
		System.out.println("\nLIST OF PASS STUDENTA (>=50)");
		Line();
		
		for(Student student : students) {
			if(student.isPass()) {
				System.out.println(">> "+student.getName()+"("+student.getScore()+")"
			+" get grade "+ findGrade(student.getScore()));
			}
		}
		
		scan.close();
	}
	
	public static String findGrade(int score) {
		if (score >=80) return "A";
		else if (score >=75 && score <=79) return "B+";
		else if (score >=70) return "B";
		else if (score >=65) return "C+";
		else if (score >=60) return "C";
		else if (score >=55) return "D+";
		else if (score >=50) return "D";
		else  return "F";
		
	}
	
	
	
	
	public static void Line() {
		for(int i=1;i<40;i++) {
			System.out.print("-");
		}
		System.out.println();
		
	}

}
