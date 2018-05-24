package FactoryPattern;

public class FactoryPattern {
	public static void main(String [] args){
		ShapeFactory factory = new ShapeFactory();
		factory.GetShape("rect").Draw();
	}
}
