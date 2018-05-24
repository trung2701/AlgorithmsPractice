package AbstractFactoryPattern;

public class ColorFactory {

	public Color GetShape(String color){
		switch (color) {
		case "blue":
			return new Blue();
		case "red":
			return new Red();
		default:
			return null;
		}
	}
}
