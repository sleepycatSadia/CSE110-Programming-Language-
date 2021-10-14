import java.util.Scanner;
public class task6 
{
  public static void main(String []args )
  {
    float L;
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me value of S:");
    float S;
    S=sc1.nextFloat();
    if(S>=100)
    {
      L=12000/(4+(S*S/14900));
    } 
    else
    {
      L=3000-(125*S*S);
    } 
    System.out.println(L); 
  }
}