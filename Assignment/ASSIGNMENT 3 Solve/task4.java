import java.util.Scanner;
public class task4 
{
  public static void main(String []args )
  {
    double tax;
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me age:");
    int a;
    a=sc1.nextInt();
    if(a>=18)
    {
      Scanner sc2=new Scanner(System.in);
      System.out.println("Give me the payment:");
      int p;
      p=sc2.nextInt();
      if(p>20000)
      {System.out.println(tax=(p*0.1));}
      else if(p>=10000)
      {System.out.println(tax=(p*0.05));}
    }
    else
    {System.out.println("No tax");}
    
  }
}
