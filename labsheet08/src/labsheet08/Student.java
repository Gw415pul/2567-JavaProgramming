package labsheet08;

public class Student {
	private String studentName;
	private int studentScore;
	
	public void setName(String stdName) {
		stdName = studentName;
	}
	public String getName() {
		return studentName;
	}
	public void setScore(int stdScore) {
		stdScore = studentScore;
	}
	public int getScore() {
		return studentScore;
	}
	public boolean checkScore() {
		/*if (getScore()>=0 && getScore()<=100) {
			return true;
		} else {
			return false;
		}*/
		/*if (getScore()>=0 && getScore()<=100)
			return true;
		return false;*/
		return getScore()>=0 && getScore()<=100;
	}
	
	public boolean isPass() {
		return getScore() >=50;
		/*if (getScore() >=50) {
			return true;
		}
		return false;*/
	}

}
