import java.util.Scanner;
public class task3 
{
  public static void main(String []args )
  {
    float area; 
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me the height:");
    float h;
    h=sc1.nextFloat();
    Scanner sc2=new Scanner(System.in);
    System.out.println("Give me the width:");
    float w;
    w=sc2.nextFloat();
    area=h*w;
    System.out.println("The area is: "+ area);
    
  }
}