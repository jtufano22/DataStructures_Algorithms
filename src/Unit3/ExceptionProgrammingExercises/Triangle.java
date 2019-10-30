package Unit3.ExceptionProgrammingExercises;

class Triangle extends GeometricObject {
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	/** Constructor */
	public Triangle() {
	}

	/** Constructor */
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		boolean valid = ((side1 + side2 > side3) && (side2+ side3 > side1) && (side1 + side3 > side2));
		if (!valid) {
			throw new IllegalTriangleException("");
		}
	}

	/** Implement the abstract method findArea in GeometricObject */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/**
	 * Implement the abstract method findCircumference in GeometricObject
	 **/
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Override the toString method */
	public String toString() {
		// Implement it to return the three sides
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;
	}
}