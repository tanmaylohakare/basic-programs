package Inheritance;




public class OOPS {
	public static void main(String[] args) {
		
	}
}
class Shape
{
	public void Area()
	{
		System.out.println("Display Area :- ");
	}
}

class Triangle extends Shape
{
	public void Area(int L,int H)
	{
        System.out.println("Triangle Area: " + (0.5 * L * H)); // Correct calculation
	
	}
}

class Circle extends Shape
{
	public void Area(int r)
	{
		System.out.println("Area of Circle :- "+3.14*r);
	}
}

class EqualitralTriangle extends Triangle
{
public void Area(int L,int K,int J)
{
    System.out.println("Equilateral Triangle Volume: " + (L * K * J)); // Custom logic
	
}
}
