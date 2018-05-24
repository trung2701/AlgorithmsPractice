package AbstractFactoryPattern;

public class ShapeFactory {
	
	public Shape GetShape(String shape){
		switch (shape) {
		case "rect":
			return new Rectangle();
		case "circle":
			return new Circle();
		default:
			return null;
		}
	}
}
