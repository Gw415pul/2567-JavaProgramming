package lapsheet05;
import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] score = new  double[5];
		double total = 0;
		
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
		} 
		for(double _score : score) {
			total += _score;
		}
		double avg = total/score.length;
		System.out.printf("%nAverage of %d student : %.2f",score.length,avg);
		for(int i =0; i<score.length;i++) {
			System.out.printf("> Student %d (%.2f)\n",score.length,score[i]);
		}

		
	}

}
