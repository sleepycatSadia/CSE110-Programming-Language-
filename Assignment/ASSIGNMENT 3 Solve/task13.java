import java.util.Scanner;
public class task13
{
  public static void main(String []args )
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Give me 1st value:");
    int a;
    a=sc1.nextInt();
    Scanner sc2=new Scanner(System.in);
    System.out.println("Give me 2nd value:");
    int b;
    b=sc2.nextInt();
    Scanner sc3=new Scanner(System.in);
    System.out.println("Give me 3rd value:");
    int c;
    c=sc3.nextInt();
    Scanner sc4=new Scanner(System.in);
    System.out.println("Give me 4th value:");
    int d;
    d=sc4.nextInt();
    int temp=0;
    temp=d;
    d=a; 
    a=b;
    b=c;
    c=temp;
    System.out.println("a= "+ a);
    System.out.println("b= "+ b); 
    System.out.println("c= "+ c);
    System.out.println("d= "+ d);
  }
}