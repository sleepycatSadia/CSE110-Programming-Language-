import java.util.Scanner;
public class task2 
{
  public static void main(String []args )
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me your mark:");
    int m;
    m=sc1.nextInt();
    if(m<=100&&m>=0)
    {
      if(m>=90){System.out.println("A");}
      else if(m>=80){System.out.println("B");}
      else if(m>=70){System.out.println("C");}
      else if(m>=60){System.out.println("D");}
      else if(m>=50){System.out.println("E");} 
      else {System.out.println("F");}
    }
    else
    {
      System.out.println("Wrong Input");
    }
    
  }
}