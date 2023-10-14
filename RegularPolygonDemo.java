/*
This program was created by Olivia Lewandowski on March 25, 2023 
This program creates a class called regular polygon which has fields of n (number of sides), side (side length), x and y
It creates three instanes of the class in order to get the perimeter and the area of the polygons, by invoking methods.
 */

public class RegularPolygonDemo 
{
    public static void main (String [] args)
    {
        //creating three regular polygon objects with specified values
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //display perimeter and area for each object
        System.out.println("The perimeter and area of regular polygon #1 are: " + regularPolygon1.getPerimeter() + " units and " + regularPolygon1.getArea() + " units squared!");
        System.out.println("The perimeter and area of regular polygon #2 are: " + regularPolygon2.getPerimeter() + " units and " + regularPolygon2.getArea() + " units squared!");
        System.out.println("The perimeter and area of regular polygon #3 are: " + regularPolygon3.getPerimeter() + " units and " + regularPolygon3.getArea() + " units squared!");
    }
}

class RegularPolygon
{
    //state: properties or attributes or data or fields
    private int n;
    private double side;
    private double x;
    private double y;

    //constructors
    //no-arg constructor
    public RegularPolygon()
	{
		n = 3;
		side = 1;
        x = 0;
        y = 0;
	}

    //arg constructors
    //takes only two args n and side, leaving center at (0,0)
    public RegularPolygon(int newN, double newSide)
    {
        n = newN;
		side = newSide;
        x = 0;
        y = 0;
    }

    //takes all four args
    public RegularPolygon(int newN, double newSide, double newX, double newY)
    {
        n = newN;
		side = newSide;
        x = newX;
        y = newY;
    }

    //behavior - methods
    //getter methods
    public int getN() 
    {
        return n;
    }

    public double getSide() 
    {
        return side;
    }

    public double getX() 
    {
        return x;
    }

    public double getY()
    {
        return y;
    }


    //setter methods
    public void setN(int newN) 
    {
        n = newN;
    }

    public void setSide(double newSide) 
    {
        side = newSide;
    }

    public void setX(double newX)
    {
        x = newX;
    }

    public void setY(double newY)
    {
        y = newY;
    }

    //regular methods - to find perimeter and area
    public double getPerimeter() 
    {
        return n * side;
    }

    public double getArea() 
    {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}