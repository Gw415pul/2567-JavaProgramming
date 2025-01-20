package labsheet07;

public class Rectangle {
	private float L;
	private float W;
	
	Rectangle() {
		L=1.0f;
		W=1.0f;
	}
	/*private float L= 1.0f;
	private float W= 1.0f;
	Rectangle() {}
	 * */
	
	Rectangle(float L,float W){
		this.L = L;
		this.W = W;
	}
	
	public float getL() {
		return this.L;
	}
	
	public void setL(float L) {
		this.L =L;
	}
	
	public float getW() {
		return this.W;
	}
	
	public void setW(float W) {
		this.W =W;
	}
	
	public double getArea() {
		return this.L*this.W;
	}
	
	public double getPerimeter() {
		return 2*(this.L+this.W);
	}
	
	public String toString() {
		return "Rectangle[length= "+this.L+",width="+this.W+"]"; 
	}

}
