import java.util.Scanner;
public class task1 
{
  public static void main(String []args )
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me the mark:");
    int num;
    num=sc1.nextInt();
    if(num>50)
    {
      System.out.println("Pass.");
    }
    Else
    {
      System.out.println("You shall not pass.");
    }
    
  }
}
