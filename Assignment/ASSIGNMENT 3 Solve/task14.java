import java.util.Scanner;
public class task14 
{
  public static void main(String []args )
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter a number :");
    int num;
    num=sc1.nextInt();
    int a_v=0;
    if(num>0)
    {
      a_v=num;
    }
    else
    {
      a_v=-num;
    }
    System.out.println("The absolute value is :" +a_v); 
  }
}