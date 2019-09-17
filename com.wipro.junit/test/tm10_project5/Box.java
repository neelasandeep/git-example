package tm10_project5;
public class Box {
	double Length;
	double width;
	double height;
	public Box(double length, double width, double height) {
		super();
		Length = length;
		this.width = width;
		this.height = height;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		return (int)(Length*height* width);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Box)) {
			return false;
		}
		Box other = (Box) obj;
		double volume=Length*height*width;
		return Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.Length*other.height*other.width);
				
	}

}
