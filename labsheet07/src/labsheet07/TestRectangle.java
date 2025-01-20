package labsheet07;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		//System.out.println(r1.toString());
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		System.out.println();
		
		r1.setL(5.6f);
		r1.setW(7.8f);
		System.out.println(r1);
		System.out.println("Lenght is "+ r1.getL());
		System.out.println("Width is "+ r1.getW());
		System.out.println();
		
		System.out.printf("area is %.2f%n",r1.getArea());
		System.out.printf("perimeter is %.2f",r1.getPerimeter());

	}

}
