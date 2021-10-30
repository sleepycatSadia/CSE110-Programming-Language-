import java.util.Scanner;

public class test725 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a number");
    int n = scan.nextInt();
    int r=1;
    for(int i=0;i<n;++i){
      for(int j=0;j<(n-r);++j){
        System.out.print(' ');
      }
      for(int j=0;j<r;++j){
        System.out.print(j+1);
      }
      for(int j=r-1;j>0;--j){
        System.out.print(j);
      }
      for(int j=0;j<(n-r);++j){
        System.out.print(' ');
      }
      System.out.println();
      ++r;
    }
  }
}