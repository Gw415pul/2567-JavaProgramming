import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner cb = new Scanner(System.in);
		
		String sen;
		int sp;
		char wd;
		
		
			System.out.print("Input a sentence :");
			sen = cb.next();
			
            for(sp=0; sp < sen.length(); sp++) {
				wd= sen.charAt(sp);
				if((wd == ' ')||wd =='\t') {
					sp++;
				}
				
			}
            while(true) {
			if(sen.endsWith(".")) {
				System.out.println("\nThis sentence has "+(sp-1)+" spacebar.");
				System.out.println("This sentence has "+(sp)+" word.");
				break;
			}else {
				System.out.print("Input a sentence, again :");
				sen = cb.next();
				
			}
		
            }
	}

}
