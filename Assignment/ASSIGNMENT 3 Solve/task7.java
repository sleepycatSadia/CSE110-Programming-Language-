import java.util.Scanner;
public class task7
{
  public static void main(String []args )
  {
    float s;
    double area; 
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me value of first side:");
    float x;
    x=sc1.nextFloat();
    Scanner sc2=new Scanner(System.in);
    System.out.println("Give me value of second side:");
    float y;
    y=sc2.nextFloat();
    Scanner sc3=new Scanner(System.in);
    System.out.println("Give me value of third side:");
    float z;
    z=sc3.nextFloat();
    s=(x+y+z)/2;
    area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    {System.out.println("The area of triangle is: " + area);}
  }

}