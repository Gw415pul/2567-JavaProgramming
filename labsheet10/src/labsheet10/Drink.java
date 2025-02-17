package labsheet10;

public class Drink {
	private int type;
	private char size;
	
	public Drink(int type, char size) {
		this.type=type;
		this.size=size;
	}
	Drink(){
		this.type=0;
		this.size='\u0000';
	}
	public String getTypeName() {
		if(this.type==1) {
			return "Hot";
		}if (this.type == 2) {
			return "Cold";
		}
		return null;
	}
	public int getTypePrice() {
		if(this.type==1) {
			return 10;
		}if (this.type == 2) {
			return 20;
		}
		return 0;
	}
	public String getSizeNmae() {
		if(this.size=='s'||this.size=='S') {
			return "Small";
		}if (this.size=='m'||this.size=='M') {
			return "Medium";
		}if (this.size=='l'||this.size=='L') {
			return "Large";
		}
		return null;
	}
	public int getSizePrice() {
		if(this.size=='s'||this.size=='S') {
			return 15;
		}if (this.size=='m'||this.size=='M') {
			return 20;
		}if (this.size=='l'||this.size=='L') {
			return 25;
		}
		return 0;
	}
	public int getTotalPrice() {
		return getSizePrice()+getTypePrice();
	}

}
