package area;

class Area{
	int r, l, b;
	void getArea(){
		System.out.println("this is area class");
	}

}

class Circle extends Area{
	final double PI= 3.14;
	void getCircleArea(){
		double result = PI * super.r * super.r; // always use super time les=
		System.out.println("Area of Circle ="+ result);
	}
}
public class AreaMain{

	public static void main (String [] args){

		Circle c =new Circle();
		c.getArea();
	}
}