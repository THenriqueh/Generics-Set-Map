package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircle = new ArrayList<Circle>();
		myCircle.add(new Circle(3.0));
		myCircle.add(new Circle(4.0));
		
		System.out.println("Toral area: " + String.format("%.2f", totalArea(myShapes)));
		System.out.println("Toral area: " + String.format("%.2f", totalArea(myCircle)));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
