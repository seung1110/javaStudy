package kosta.oop;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle() {
	}
	public Rectangle(int a, int b) {
		this.width = a;
		this.height = b;
	}
	
	public int area() {
		return width*height;
	}
}
