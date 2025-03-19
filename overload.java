import java.util.*;
class AreaCal
{
public double area(double radius)
{
return Math.PI*radius*radius;
}
public double area(double length,double breadth)
{
return length*breadth;
}
public double area(double base,double height,boolean isTriangle)
{
return 0.5*base*height;
}
}
public class overload
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
AreaCal cal=new AreaCal();
System.out.print("Enter radius of the circle:");
double radius=sc.nextDouble();
System.out.println("Area of circle:"+cal.area(radius));
System.out.print("\nEnter length of the rectangle:");
double length=sc.nextDouble();
System.out.print("Enter breadth of the rectangle:");
double breadth=sc.nextDouble();
System.out.println("Area of rectangle:"+cal.area(length,breadth));
System.out.print("\nEnter base of the triangle:");
double base=sc.nextDouble();
System.out.print("Enter height of the tritangle:");
double height=sc.nextDouble();
System.out.println("Area of tritangle:"+cal.area(base,height,true));
}
}


