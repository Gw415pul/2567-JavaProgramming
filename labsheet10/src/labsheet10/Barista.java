package labsheet10;

public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name, char gender) {
		this.name=name;
		this.gender= gender;
	}
	Barista(){
		this.name=null;
		this.gender='\u0000';
	}
	public String getName() {
		return this.name;
	}
	public String getGenderName() {
		if(this.gender=='m'||this.gender=='M') 
			return "Male";
		if(this.gender=='f'||this.gender=='F') 
			return "Female";
		return " ";
	}

}
