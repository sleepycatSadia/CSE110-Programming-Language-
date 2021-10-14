import java.util.Scanner;
public class task5 
{
  public static void main(String []args )
  {
    int min;
    int hour;
    int rem;
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me number of seconds:");
    int sec;
    sec=sc1.nextInt();
    if(sec>=0)
    {
      hour=sec/3600;
      rem=sec%3600;
      min=rem/60;
      sec=rem%60;
      System.out.println(sec +" seconds:");
      System.out.println(min +" minutes");
      System.out.println(hour +" hours");
    } 
  }
}
