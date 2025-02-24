package labsheet10;

public class Coffee extends Drink{
	private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    public Coffee(int type, char size, int typeCoffee, char sizeCoffee, Barista barista) {
        super(type, size);
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = sizeCoffee;
        this.barista = barista;
    }

    public String getTypeName() {
        switch (this.typeCoffee) {
            case 1: return "Americano";
            case 2: return "Espresso";
            case 3: return "Cappuccino";
            default: return "Unknown";
        }
    }

    public int getTypePrice() {
        switch (this.typeCoffee) {
            case 1: return 50;
            case 2: return 55;
            case 3: return 65;
            default: return 0;
        }
    }

    public String getSizeName() {
        switch (Character.toUpperCase(this.sizeCoffee)) {
            case 'S': return "Short";
            case 'T': return "Tall";
            case 'G': return "Grande";
            case 'V': return "Venti";
            default: return "Unknown";
        }
    }

    public int getSizePrice() {
        switch (Character.toUpperCase(this.sizeCoffee)) {
            case 'S': return 100;
            case 'T': return 150;
            case 'G': return 200;
            case 'V': return 250;
            default: return 0;
        }
    }

    public int getTotalPrice() {
        return getSizePrice() + getTypePrice();
    }

    @Override
    public String toString() {
        return "Type: " + getTypeName() + ", Size: " + getSizeName() +
               ", Price: " + getTotalPrice() + " Baht, Barista: " +
               (barista != null ? barista.getName() + " (" + barista.getGenderName() + ")" : "None");
    }

}
