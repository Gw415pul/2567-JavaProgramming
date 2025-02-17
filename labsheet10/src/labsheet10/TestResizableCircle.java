package labsheet10;

public class TestResizableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		System.out.println("Perimeter : "+rc.getPerimeter());
		System.out.println("Area of Circle is "+ rc.getArea());
		
		System.out.println();

		rc.resize(50);
		System.out.println("After resize (50%) : "+rc);
		System.out.println("Perimeter : "+rc.getPerimeter());
		System.out.println("Area of Circle is "+ rc.getArea());

	}

}
