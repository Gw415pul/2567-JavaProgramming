package lapsheet06;

public class Student {
	private String name;
	private double[] scores;
	
	public void setStudentDetails(String stdName, double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	private double calculateAverageScore() {
		double totel = 0;
		/*for(int i =1; i< scores.length;i++) {
			totel += scores[i];
		}*/
		for(double _score:scores){
			totel +=_score;			
		}
		return totel / scores.length;
	}
	
	private String getGrade() {
		double average = calculateAverageScore();
		if(average >=80) {
			return "A";
		}else if (average >=70) {
			return "B";
		}else if (average >=60) {
			return "C";
		}else if (average >=50) {
			return "D";
		}else {
			return "F";
		}
	}
	public void displayStudentDetails() {
		System.out.println("Name: "+ name);
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]+" ");
		}
		System.out.println("\nAverage Score: "+ calculateAverageScore());
		System.out.println("Grade: "+ getGrade());
	}

}
