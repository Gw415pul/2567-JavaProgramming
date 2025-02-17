package labsheet09;

public class Theater extends Movie {
    private int theaterNo;

    public Theater(String id, String name, Director director, int theaterNo) {
        super(id, name, director);
        this.theaterNo = theaterNo;
    }

    public int getTheaterNo() {
        return theaterNo;
    }

    public String getTheaterName() {
        if (theaterNo >= 1 && theaterNo <= 7) {
            return "Basic Theater";
        } else if (theaterNo >= 8 && theaterNo <= 14) {
            return "Sweet Theater";
        } else {
            return "Premium Theater";
        }
    }

    @Override
    public String toString() {
        return "Theater " + getTheaterName() + " - " + super.toString();
    }
}