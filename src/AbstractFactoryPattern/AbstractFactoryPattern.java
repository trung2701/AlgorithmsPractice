package AbstractFactoryPattern;

public class AbstractFactoryPattern {
	
	public static void main(String [] args){
		ShapeFactory factory = new ShapeFactory();
		factory.GetShape("rect").Draw();
	}
}
