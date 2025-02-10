package labsheet09;

public class Movie {
	private String id;
	private String mname;
	private Director director;
	
	public Movie(String id, String mname,Director director) {
		this.id=id;
		this.mname=mname;
		this.director=director;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.mname;
	}
	
	public Director getDirector() {
		return this.director;
	}
	
	public void setDirector(Director director) {
		this.director= director;
	}
	
	public String toString() {
		return getId()+" "+getName()+" direct by ["+director+"]";
	}

}
