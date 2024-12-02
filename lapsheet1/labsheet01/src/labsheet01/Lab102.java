package com;
import java.util.*;
public class Lab102 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		int min = scan.nextInt();
		int year = 365;
		int totelday = ((min/1440) % year);
		int totelyear = ((min/1440 ) / year);
		
		System.out.println("\n"+ min + " minutes is approximately "+
		totelyear+ " years and "+ totelday+ " days.");
		scan.close();
	}
}
