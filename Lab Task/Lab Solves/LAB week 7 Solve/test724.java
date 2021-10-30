import java.util.Scanner;

public class test724 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a number");
    int n = scan.nextInt();
    for(int i=0;i<n;++i){
      System.out.print(i+1);
    }
    for(int i=n-1;i>0;--i){
      System.out.print(i);
    }
  }
}