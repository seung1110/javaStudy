package kosta.figure;

public class FigureMain {

	public static void main(String[] args) {
		
		Figure figures[] = {new Figure(),new Circle(), new Triangle(), new Square()};
		
		for(Figure f : figures)
			f.draw();
		
	}
}
