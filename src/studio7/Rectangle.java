package studio7;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return width * length;
	}
	
	public double perimiter() {
		return (2 * width) + (2 * length);
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean isBigger(Rectangle r) {
		return this.area() > r.area();
	}
}
	
