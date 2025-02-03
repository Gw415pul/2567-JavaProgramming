package labsheet07;

public class Car {
	private String companyName;
    private String modelName;
    private int year;
    private double mileage;
    
    public Car() {
        this.companyName = "Unknown";
        this.modelName = "Unknown";
        this.year = 2000;
        this.mileage = 0.0;
    }

    public Car(String companyName, String modelName, int year, double mileage) {
        setCompanyName(companyName);
        setModelName(modelName);
        setYear(year);
        this.mileage = mileage; 
    }
    
    public void DefaultConstructor() {
        this.companyName = "Unknown";
        this.modelName = "Unknown";
        this.year = 2000;
        this.mileage = 0.0;
    }
    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.trim().isEmpty()) {
            System.out.println("Error: Invalid company or model name!");
        } else {
            this.companyName = companyName;
        }
    }

    public void setModelName(String modelName) {
        if (modelName == null || modelName.trim().isEmpty()) {
            System.out.println("Error: Invalid company or model name!");
        } else {
            this.modelName = modelName;
        }
    }

    public void setYear(int year) {
        if (year < 1886) {
            System.out.println("Error: Invalid year!");
        } else {
            this.year = year;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

}
