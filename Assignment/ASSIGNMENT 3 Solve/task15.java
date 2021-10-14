import java.util.Scanner;
public class task15
{
  public static void main(String []args )
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter the hour in 24-hour format :");
    int h;
    h=sc1.nextInt();
    if(h>=0&&h<=23)
    {
      if(h>=4&&h<=6)
      {
        System.out.println("Breakfast");
      }
      else if(h>=12&&h<=13)
      {
        System.out.println("Lunch"); 
      }
      else if(h>=16&&h<=17) 
      {
        System.out.println("Snacks");
      }
      else if(h>=19&&h<=20)
      {
        System.out.println("Dinner");
      }
      else
      {
        System.out.println("Patience is virtue");
      }
    }
    else
    {
      System.out.println("Wrong time");
    }
  }
}