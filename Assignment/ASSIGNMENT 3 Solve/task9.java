import java.util.Scanner;
public class task9 
{
  public static void main(String []args )
  {
    
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me 1st number:");
    int num1;
    num1=sc1.nextInt();
    Scanner sc2=new Scanner(System.in);
    System.out.println("Give me 2nd number:");
    int num2;
    num2=sc2.nextInt();
    Scanner sc3=new Scanner(System.in);
    System.out.println("Give me 3rd number:");
    int num3;
    num3=sc3.nextInt();
    if((num1>num2)&&(num1>num3))
    {
      System.out.println(" The largest number is: "+ num1);
    }
    else if((num2>num1)&&(num2>num3))
    {
      System.out.println(" The largest number is: "+ num2);
    }
    else
    {
      System.out.println(" The largest number is: "+ num3);
    } 
  }
}
