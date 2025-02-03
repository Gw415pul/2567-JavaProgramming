package labsheet08;

public class Author {
	private String Name;
	private String Email;
	
	public  Author (String Name,String Email) {
		this.Name = Name;
		this.Email = Email;
	}
	public Author() {
		this(null,null);
	}
	public String getName() {
		return this.Name;
	}
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public String getEmail() {
		return this.Email;
	}
	public String toString() {
		 return getName()+" ("+getEmail()+")";
	}

}
