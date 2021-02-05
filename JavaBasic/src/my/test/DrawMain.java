package my.test;

public class DrawMain {

	public static void main(String[] args) {
		Drawable arr[] = new Drawable[2];
		Circle c = new Circle();
		Square s = new Square();
		Object obj = c;
		((Circle)obj).draw();
		
		
		c.draw();
		s.draw();
		
		arr[0] = c;
		arr[1] = s;
		
		for(Drawable d : arr)
			d.draw();
		
		arr[0] = (Drawable)c;
		arr[1] = (Drawable)s;
	}

}
