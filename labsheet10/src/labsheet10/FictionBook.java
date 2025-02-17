package labsheet10;

public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	FictionBook(String title , int publicYear){
		this.publicYear=publicYear;
		this.title = title;
	}
	public void setAuthorName(String name) {
		author_name=name;
		int sapce = author_name.indexOf(" ");
		fname = author_name.substring(0,sapce);
		lname =author_name.substring(sapce+1);
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String getLastName() {
		return lname.toUpperCase();
	}
	@Override
	public String GetFristName() {
		return fname.toUpperCase();
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	@Override
	public int TotalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com"))
			return true;
		return false;
	}
	
	public String toString() {
		return this.getTitle()+"write by "+ this.getLastName().substring(0,1)+"."+this.GetFristName()+"("+this.getEmail()+")"+"\nPublished for "+this.TotalPublicYear()+"years.";
	}
}
