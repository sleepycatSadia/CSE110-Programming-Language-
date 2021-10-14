import java.util.Scanner;
public class task8 
{
  public static void main(String []args )
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter the number of published article:");
    int num;
    num=sc1.nextInt();
    int fee=0;
    fee=num*500;
    System.out.println("Total fee:" +fee); 
  }
}
