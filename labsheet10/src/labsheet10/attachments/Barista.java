package labsheet10;

public class Barista {
	private String name;
    private char gender;

    public Barista(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Barista() {
        this.name = "Unknown";
        this.gender = '\u0000';
    }

    public String getName() {
        return this.name;
    }

    public String getGenderName() {
        if (this.gender == 'M' || this.gender == 'm') {
            return "Male";
        } else if (this.gender == 'F' || this.gender == 'f') {
            return "Female";
        }
        return "Unknown";
    }

}
