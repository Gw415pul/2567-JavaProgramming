package labsheet09;

public class Director {
	private String dname;
	private String email;
	private char gender;
	
	public Director(String dname,String email,char gender) {
		this.dname = dname;
		this.email = email;
		this.gender=gender;
	}
	Director(String dname,String email){
		this(dname,email,'\u0000');
	}
	
	public String getdName() {
		return this.dname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getGenderName() {
		if(this.gender=='m'||this.gender=='M') {
			return "Male";
		}else if (this.gender=='f'||this.gender=='F') {
			return "Female";
		}else {
			return null;
		}
	}
	
	public String toString() {
		return getdName()+"("+getEmail()+";"+getGenderName()+")";
	}

}
